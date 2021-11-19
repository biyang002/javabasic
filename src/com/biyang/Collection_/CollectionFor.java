package com.biyang.Collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection<Book> col = new ArrayList<>();
        col.add(new Book("三国演义","曹雪芹",10));
        col.add(new Book("三国演义","曹雪芹",10));
        col.add(new Book("三国演义","曹雪芹",10));
        //1.使用增强for
        //2.增强for，底层仍然是迭代器
        //3.可以认为是简化版的迭代器
        //4.快捷键：col.for
        for (Book book:col){
            System.out.println("book = "+book);
        }

    }
}
