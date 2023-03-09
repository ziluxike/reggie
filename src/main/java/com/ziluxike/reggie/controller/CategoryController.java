package com.ziluxike.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ziluxike.reggie.common.R;
import com.ziluxike.reggie.entity.Category;
import com.ziluxike.reggie.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: ziluxike
 * Time: 2023/1/3 18:04
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 存储菜品分类
     * @param category
     * @return
     */
    @PostMapping
    public R<String> save(@RequestBody Category category) {
        if (categoryService.save(category)) {
            return R.success("添加成功！");
        }
        return R.error("添加失败!");
    }

    /**
     * 查询所有分类
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize) {
        Page pageInfo = new Page(page, pageSize);
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(Category::getSort);

        categoryService.page(pageInfo, queryWrapper);

        return R.success(pageInfo);
    }


    /**
     * 更新分类信息
     * @param category
     * @return
     */
    @PutMapping
    public R<String> page(@RequestBody Category category) {
        if (categoryService.updateById(category)) {
            return R.success("更新成功!");
        }
        return R.error("更新失败!");
    }

    /**
     * 删除分类信息
     * @param ids
     * @return
     */
    @DeleteMapping()
    public R<String> remove(Long ids) {
        categoryService.remove(ids);
        return R.success("分类信息删除成功");
    }

    /**
     * 获取所有菜品分类
     * @param category
     * @return
     */
    @GetMapping("/list")
    public R<List<Category>> list(Category category) {
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(category.getType() != null, Category::getType, category.getType());

        queryWrapper.orderByAsc(Category::getSort).orderByDesc(Category::getUpdateTime);

        List<Category> categories = categoryService.list(queryWrapper);

        return R.success(categories);
    }

}
