package com.wanghonghui.test;

import java.util.*;

public class ListSortTest {
    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("value", 3);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("value", 2);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("value", 1);
        Map<String, Object> map4 = new HashMap<>();
        map4.put("value", 4);

        list.add(map);
        list.add(map2);
        list.add(map3);
        list.add(map4);

        System.out.println("排序前--:" + list.toString());

        Collections.sort(list, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> a, Map<String, Object> b) {
                return (int) b.get("value") - (int) a.get("value");
            }
        });

        System.out.println("排序前后--:" + list.toString());

    }
}
