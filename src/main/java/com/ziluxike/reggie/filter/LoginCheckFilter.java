package com.ziluxike.reggie.filter;

import com.alibaba.fastjson.JSON;
import com.ziluxike.reggie.common.BaseContext;
import com.ziluxike.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Author: ziluxike
 * Time: 2023/1/2 23:13
 * <p>
 *     如果用户不登录,则拦截去登录
 * </p>
 */
@Slf4j
@WebFilter(filterName = "LoginCheckFilter", urlPatterns = "/*")
public class LoginCheckFilter implements Filter {
    private static final AntPathMatcher ANT_PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request =  (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String requestURI = request.getRequestURI();

        // 不需要拦截的链接
        String[] urls = new String[]{
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**",
                "/common/**",
                "/user/sendMsg",
                "/user/login",
        };
        // 判断这次请求是否需要处理
        boolean check = check(urls, requestURI);

        // 如果不需要则直接放行
        if (check) {
//            log.info("本次拦截到{}，不需要处理",requestURI);
            chain.doFilter(request, response);
            return;
        }

        // 判断管理员登录状态，如果已登录，则直接放行
        if (request.getSession().getAttribute("employee") != null) {
            Long id = (Long) request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(id);

            chain.doFilter(request, response);
            return;
        }

        // 判断用户登录状态，如果已登录，则直接放行
        if (request.getSession().getAttribute("user") != null) {
            Long id = (Long) request.getSession().getAttribute("user");
            BaseContext.setCurrentId(id);

            chain.doFilter(request, response);
            return;
        }

        // 如果没有登录则返回未登录结果，通过输出流的方式向客户端页面响应数据
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
    }

    /**
     * 路径匹配，检查本次请求是否需要放行
     * @param urls
     * @param requestURI
     * @return
     */
    public boolean check(String[] urls,String requestURI) {
        for (String url : urls) {
            boolean match = ANT_PATH_MATCHER.match(url, requestURI);
            if (match) {
                return true;
            }
        }
        return false;
    }
}
