package com.ziluxike.reggie.common;

/**
 * Author: ziluxike
 * Time: 2023/1/3 17:11
 * <p>
 *     线程信息
 * </p>
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static long getCurrentId() {
        return threadLocal.get();
    }
}
