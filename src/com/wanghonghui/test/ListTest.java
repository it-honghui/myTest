package com.wanghonghui.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        List<String> removeList = new ArrayList<>();
        for (String s : list) {
            if ("2".equals(s)) {
                removeList.add("2");
            }
        }

        list.removeAll(removeList);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
