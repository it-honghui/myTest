package com.wanghonghui.test;

import com.wanghonghui.utils.DateUtils;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //创建SimpleDateFormat对象实例并定义好转换格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");

        try {
            Date timee = sdf.parse("2019-01-14");
            String format = sdf2.format(timee);
            System.out.println("字符串转换成时间:" + format);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void demo1() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        SimpleDateFormat sdf2 = new SimpleDateFormat("M月");

        try {
            Date timee = sdf.parse("201901");
            String format = sdf2.format(timee);
            //System.out.println("字符串转换成时间:" + format);
            String s = DateUtils.stringConversionString("201901", "yyyyMM", "M月");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * 给字符时间排序
     *
     * @throws Exception
     */
    @Test
    public void demo2() throws Exception {
        String[] time = {"201801", "201808", "201807", "201803"};
        Date[] dates = new Date[time.length];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        SimpleDateFormat sdf2 = new SimpleDateFormat("M月");
        sdf.setLenient(true);
        for (int i = 0; i < time.length; i++) {
            dates[i] = sdf.parse(time[i]);
        }
        Arrays.sort(dates);
        for (int i = 0; i < dates.length; i++) {
            System.out.println(sdf2.format(dates[i]));
        }
    }

    /**
     * 根据年月获取改该月的天数
     *
     * @throws Exception
     */
    @Test
    public void demo3() throws Exception {
        String year = "2018";
        String month = "02";
        String days;

        switch (month) {
            case "02": {
                if (0 == (Integer.valueOf(year) % 4) && (0 != (Integer.valueOf(year) % 100) || 0 == (Integer.valueOf(year) % 400))) {
                    days = "29";
                } else {
                    days = "28";
                }
                break;
            }
            case "04":
            case "06":
            case "09":
            case "11":
                days = "30";
                break;
            default:     //1,3,5,7,8,10,12
                days = "31";
                break;
        }
    }


    /**
     * 根据年月获取改该月的天数
     *
     * @throws Exception
     */
    @Test
    public void demo4() throws Exception {
        String year = "2020";
        String month = "2";
        int days = DateUtils.getDays2(Integer.valueOf(year), Integer.valueOf(month));
        String startTime = year + month + "01";
        String endTime = year + month + days;

        System.out.println(startTime + "---" + endTime);
    }

    /**
     * 获取当前时间的前两小时
     *
     * @throws Exception
     */
    @Test
    public void demo5() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH");
        String startTime = df.format(new Date()) + ":00:00";
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 2);
        String endTime = df.format(calendar.getTime()) + ":00:00";
    }

}
