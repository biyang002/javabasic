package com.biyang.Lambda.syntax;

import com.biyang.Lambda.data.Person;

public class Syntax4 {
    public static void main(String[] args) {
        PersonCreator personCreator = () ->new Person();
        //构造方法的引用：
        PersonCreator personCreator1 = Person::new;
        Person a = personCreator1.gerPerson();

        PersonCreator2 personCreator2 = Person::new;
        Person b = personCreator2.getPerson("xiaoming", 4);

    }
}
//需求：
interface PersonCreator{
    Person gerPerson();
}
interface PersonCreator2{
    Person getPerson(String name,int age);
}
