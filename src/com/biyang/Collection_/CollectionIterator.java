package com.biyang.Collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 */

public class CollectionIterator {
    public static void main(String[] args) {
        Collection<Book> col = new ArrayList<>();
        col.add(new Book("三国演义","曹雪芹",10));
        col.add(new Book("三国演义","曹雪芹",10));
        col.add(new Book("三国演义","曹雪芹",10));
/**
 * 当退出while循环后，如今迭代器已经指向了最后一个元素，如果继续会出现一场
 * 如果需要再次进行遍历，需要重置迭代器
 */
        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----第二次遍历----");
        iterator = col.iterator();


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
