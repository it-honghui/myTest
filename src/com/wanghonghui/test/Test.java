package com.wanghonghui.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "we1are3happy4";
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        String newStr = m.replaceAll("").trim();
        int count = 0;
        for (int i = 0; i < newStr.length(); i++) {
            count++;
            System.out.println(newStr.charAt(i));
        }
        System.out.println("count:" + count);
    }

}
