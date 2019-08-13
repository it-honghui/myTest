package com.wanghonghui.test;

import com.wanghonghui.utils.StringUtils;

import java.util.Scanner;

public class PhoneNumberTest {

    public static void main(String[] args) {
        System.out.println("请输入手机号码");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = StringUtils.checkMobile(s);
        System.out.println(s1);
    }


}
