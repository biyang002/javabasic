package com.biyang.Lambda.exercise;

import com.biyang.Lambda.data.Person;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise1 {
    //集合排序
    //ArrayList<>
    public static void main(String[] args) {
        //需求：已知在一个ArrayList中有若干个Person对象，将这些Person对象按照年龄进行降序排序。
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("xiaoming",10));
        list.add(new Person("lilei",11));
        list.add(new Person("hanmeimei",12));
        list.add(new Person("lili",9));
        list.add(new Person("lucy",9));
        list.add(new Person("polly",3));
        list.add(new Person("uncle wang",40));

        //升序排列
        Comparator<Person> comparator = (o1,o2)->{
            return o1.age-o2.age;
        };
        list.sort(comparator);

        //精简语法，降序排列
        list.sort((o1,o2)-> o2.age-o1.age );
        System.out.println(list);
    }
}
