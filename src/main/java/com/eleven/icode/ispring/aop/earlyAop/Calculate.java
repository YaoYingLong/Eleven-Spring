package com.eleven.icode.ispring.aop.earlyAop;

/**
 * @author by YingLong on 2021/9/26
 */
public interface Calculate {
    /**
     * 加法
     */
    int add(int numA, int numB);

    /**
     * 减法
     */
    int sub(int numA, int numB);

    /**
     * 除法
     */
    int div(int numA, int numB);

    /**
     * 乘法
     */
    int multi(int numA, int numB);

    int mod(int numA, int numB);
}
