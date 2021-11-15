package com.biyang.Lambda;

public class Lambda {
    public static void main(String[] args) {

        //使用接口实现类的形式
        Comparator comparator = new myComparator();

        //使用匿名内部类
        Comparator comparator1 = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a-b;
            }
        };

        //使用Lambda,对接口的引用进行赋值
        Comparator comparator2 = (a,b) -> a-b;


    }

}

class myComparator implements Comparator{

    @Override
    public int compare(int a, int b) {
        return a-b;
    }
}

@FunctionalInterface
interface Comparator{
    int compare(int a,int b);
}
