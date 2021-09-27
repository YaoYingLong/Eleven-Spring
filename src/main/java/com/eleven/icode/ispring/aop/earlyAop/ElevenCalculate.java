package com.eleven.icode.ispring.aop.earlyAop;

import org.springframework.aop.framework.AopContext;

/**
 * @author by YingLong on 2021/9/26
 */
public class ElevenCalculate implements Calculate {
    @Override
    public int add(int numA, int numB) {
        System.out.println("执行目标方法:add");
        System.out.println(1 / 0);
        return numA + numB;
    }

    @Override
    public int sub(int numA, int numB) {
        System.out.println("执行目标方法:reduce");
        return numA - numB;
    }

    @Override
    public int div(int numA, int numB) {
        System.out.println("执行目标方法:div");
        return numA / numB;
    }

    @Override
    public int multi(int numA, int numB) {
        System.out.println("执行目标方法:multi");
        return numA * numB;
    }

    @Override
    public int mod(int numA, int numB) {
        System.out.println("执行目标方法:mod");
        int retVal = ((Calculate) AopContext.currentProxy()).add(numA, numB);
        //int retVal = this.add(numA,numB);
        return retVal % numA;
        //return numA%numB;
    }
}
