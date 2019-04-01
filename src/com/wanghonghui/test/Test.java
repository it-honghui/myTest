package com.wanghonghui.test;

import com.wanghonghui.utils.DateUtils;

import java.text.ParseException;

public class Test {
    public static void main(String[] args) throws ParseException {
        String[] weekDayArray = DateUtils.getTimeWeekDayArray("2019-03-27", "yyyy-MM-dd", "yyyyMMdd");
        for (int i = 0; i < weekDayArray.length; i++) {
            System.out.println(weekDayArray[i]);
        }
    }
}
