package com.biyang.Collection_.List;

import java.util.ArrayList;

/**
 * 主要用于追源码
 */
public class ArrayListSource {
    public static void main(String[] args) {
        //注意：idea默认情况下，debug显示的数据是简化后的，如果希望看到完整版的数据需要做设置。
        //使用无参构造起创建Arraylist：
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }

        ArrayList arrayList1 = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
            arrayList1.add(i);
        }
        for (int i = 8; i < 10; i++) {
            arrayList1.add(i);
        }
    }
}
