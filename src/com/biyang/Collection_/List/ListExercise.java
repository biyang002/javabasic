package com.biyang.Collection_.List;


import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List<Book> list = new ArrayList();
        list.add(new Book("红楼梦","曹雪芹",100));
        list.add(new Book("西游记","吴承恩",10));
        list.add(new Book("水浒传","施耐庵",9));
        list.add(new Book("三国演义","罗贯中",80));
        //使用Lambda表达式进行排序
        list.sort((o1,o2)-> o1.getTime()-o2.getTime());
        for (Book book : list) {
            System.out.println("名称："+book.getName()+"价格： "+book.getTime()+"作者："+book.getAuthor());
        }

    }
}
class Book{
    private String name;
    private String author;
    private int time;

    public Book(String name, String author, int time) {
        this.name = name;
        this.author = author;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", time=" + time +
                '}';
    }
}
