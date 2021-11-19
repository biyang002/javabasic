package com.biyang.Collection_.List;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("biang");
        list.add("lisi");
        System.out.println("list="+list);
        //在指定位置添加元素
        list.add(1,"三三");
        System.out.println("list="+list);
        //返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("三三"));
        //返回obj在集合中末次出现的位置
        list.add("三三");
        System.out.println(list.lastIndexOf("三三"));
        //设置obj在集合中指定位置的值，相当于替换
        list.set(0, "biyang");
        System.out.println("list = "+list);
        //返回从fromIndex到toIndex的子集合，是前闭后开的形式
    }
}
