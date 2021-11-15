package com.biyang.Lambda.syntax;

import com.biyang.Lambda.interfaces.*;

public class Syntax1 {
    public static void main(String[] args) {
        //Lambda表达式的基础语法
        //Lambda是一个匿名函数
        //参数列表 方法体

        //（ ）：用来描述参数列表
        //{ } :描述方法体
        // -> :Lambda运算符，读作 goes to

        //无参无返回
        LambdaNoneReturnNoneParameter lambdaNoneReturnNoneParameter = () -> {
            System.out.println("hi world");
        };
        lambdaNoneReturnNoneParameter.test();

        //无返回，单参
        LambdaNoneReturnSingleParameter lambdaNoneReturnSingleParameter = (int a) ->{
            System.out.println(a);
        };
        lambdaNoneReturnSingleParameter.test(10);
        //无返回，多参
        LambdaNoneReturnMultipleParameter lambdaNoneReturnMultipleParameter = (int a,int b) ->{
            System.out.println(a+b);
        };
        lambdaNoneReturnMultipleParameter.test(10, 10);

        //无参有返回
        LambdaSingleReturnNoneParameter lambdaSingleReturnNoneParameter = () ->{
            int a = 30;
            return a;
        };
        System.out.println(lambdaSingleReturnNoneParameter.test());
        //单参，有反
        LambdaSingleReturnSingleParameter lambdaSingleReturnSingleParameter = (int a) -> {
            return a;
        };
        System.out.println(lambdaSingleReturnSingleParameter.text(30));

        //多参，有反
        LambdaSingleReturnMultipleParameter lambdaSingleReturnMultipleParameter = (int a,int b) -> {
            return a+b;
        };
        System.out.println(lambdaSingleReturnMultipleParameter.test(30, 30));
    }
}
