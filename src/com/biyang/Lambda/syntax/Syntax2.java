package com.biyang.Lambda.syntax;


import com.biyang.Lambda.interfaces.LambdaNoneReturnMultipleParameter;
import com.biyang.Lambda.interfaces.LambdaNoneReturnSingleParameter;
import com.biyang.Lambda.interfaces.LambdaSingleReturnSingleParameter;

//Lambda表达式语法的精简
public class Syntax2 {
    public static void main(String[] args) {

        //语法精简
        //1.参数：
        //由于在接口的抽象方法中，已经定义了参数的数量和类型，所以在Lambda表达式中，参数的类型可以省略
        //备注：如果需要省略类型，则每一个参数的类型都要省略。
        LambdaNoneReturnMultipleParameter lambdaNoneReturnMultipleParameter = (a,b) ->{
            System.out.println(a+b);
        };
        lambdaNoneReturnMultipleParameter.test(10,10);

        //2.参数小括号：
        //如果参数列表中，参数数量只有一个，此时小括号可以省略
        LambdaNoneReturnSingleParameter lambdaNoneReturnSingleParameter = a -> {
            System.out.println(a);
        };
        lambdaNoneReturnSingleParameter.test(10);

        //3. 方法大括号
        //如果方法体中只有一条语句，此时大括号可以省略
        LambdaNoneReturnSingleParameter lambdaNoneReturnSingleParameter3 = a -> System.out.println(a);
        lambdaNoneReturnSingleParameter3.test(10);

        //4.如果方法体中，唯一一条语句是返回语句，则在省略大括号的同时，也要省略掉return语句。
        LambdaSingleReturnSingleParameter lambdaSingleReturnSingleParameter = a -> a;
        System.out.println(lambdaSingleReturnSingleParameter.text(10));



    }
}
