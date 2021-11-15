package com.biyang.Lambda.syntax;

import com.biyang.Lambda.interfaces.LambdaSingleReturnMultipleParameter;
import com.biyang.Lambda.interfaces.LambdaSingleReturnSingleParameter;

//方法引用
public class Syntax3 {
    public static void main(String[] args) {
        //方法引用
        //快速的将一个Lambda表达式的实现指向一个已经实现的方法
        //语法：方法的隶属者：：方法名
        //      （静态方法的隶属者是类，非静态方法隶属者是对象）

        //注意：
        //1.参数数量和类型一定要和接口中定义的方法保持一致
        //2.返回值类型也要保持一致

        LambdaSingleReturnSingleParameter lambdaSingleReturnSingleParameter1 = a -> change(a);
        lambdaSingleReturnSingleParameter1.text(10);
        //方法引用：引用了change方法的实现
        LambdaSingleReturnSingleParameter lambdaSingleReturnSingleParameter2 = Syntax3 :: change;
        lambdaSingleReturnSingleParameter2.text(10);


        LambdaSingleReturnMultipleParameter lambdaSingleReturnMultipleParameter1 = (a,b) -> change(a);
        System.out.println(lambdaSingleReturnMultipleParameter1.test(10,10));
        LambdaSingleReturnMultipleParameter lambdaSingleReturnMultipleParameter2 = Syntax3::change2;
        System.out.println(lambdaSingleReturnMultipleParameter2.test(20, 50));
    }

    private static int change(int a) {
        return a*2;
    }
    private static  int change2(int a,int b){
        return a+b;
    }
}
