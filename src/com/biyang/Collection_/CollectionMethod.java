package com.biyang.Collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class CollectionMethod {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //add 添加单个元素
        list.add("jacky");
        list.add(10);
        list.add(true);
        //remove 删除指定元素
        list.remove("jacky");
        System.out.println("list = " +list);
        //contains:查找某个元素是否存在
        System.out.println(list.contains("jacky"));
        //size:获取元素个数
        System.out.println(list.size());
        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());
        //clear清空
        //addAll:添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("hon");
        list2.add("lou");
        list.addAll(list2);
        System.out.println("list = "+list);
        //containsAll:
        //removeALl:
        }
}
