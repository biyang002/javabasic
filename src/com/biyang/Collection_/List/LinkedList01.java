package com.biyang.Collection_.List;

public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");

        //连接三个节点，形成双向链表
        a.next = b;
        b.next =c;
        b.pre = a;
        c.pre = b;

        Node first = a; //让first 引用指向a,就是双向链表的头结点
        Node last = c;//让last 引用指向c,就是双向链表的尾结点

        //练习从头到尾进行遍历
        while (true){
            if (first == null) break;
            //输出first信息
            System.out.println(first);
            first = first.next;
        }
        //练习从尾到头进行遍历
        while (true){
            if (last == null) break;
            //输出last信息
            System.out.println(last);
            last = last.pre;
        }

        //演示链表添加对象/数据
        //要求，在b，c之间加入d
        //1.创建node节点
        Node d = new Node("d");
        b.next = d;
        d.next = c;
        c.pre = d;
        d.pre = b;
        first = a;
        while (true){
            if (first == null) break;
            System.out.println(first);
            first = first.next;
        }




    }
}
//定义一个Node类，表示双向链表的一个结点
class Node{
    public Object item;//真正存放数据
    public Node next;//指向下一个节点
    public Node pre;//指向前一个节点
    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
