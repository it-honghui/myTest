package com.wanghonghui.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     * 时间格式字符串转字符转
     * 例如: 201901->1月
     *
     * @param dateStr
     * @param dateType
     * @param dateType2
     * @return formatDate
     * @throws Exception
     */
    public static String stringConversionString(String dateStr, String dateType, String dateType2) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(dateType);
        SimpleDateFormat sdf2 = new SimpleDateFormat(dateType2);
        Date date = sdf.parse(dateStr);
        String formatDate = sdf2.format(date);
        return formatDate;
    }

    /**
     * 根据年份月份获取改月的天数
     *
     * @param year
     * @param month
     * @return
     * @throws Exception
     */
    public static String getDays(String year, String month) throws Exception {
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
        return days;
    }

    /**
     * 根据年份月份获取改月的天数
     *
     * @param year
     * @param month
     * @return
     * @throws Exception
     */
    public static int getDays2(int year, int month) throws Exception {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (2 == month && 0 == (year % 4) && (0 != (year % 100) || 0 == (year % 400))) {
            days[1] = 29;
        }
        return (days[month - 1]);
    }

    /**
     * 获取当前日期的下个月1号
     *
     * @param year
     * @param month
     * @return
     * @throws Exception
     */
    public static String getNextMonthFirstDate(int year, int month, String pattern) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date nextMonthFirstDate = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(nextMonthFirstDate);
    }

    /**
     * 获取当前时间月份的1号
     *
     * @param pattern
     * @return
     * @throws Exception
     */
    public static String getMonthFirstDate(String pattern) throws Exception {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date monthFirstDate = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(monthFirstDate);
    }

    /**
     * 获取当前时间下月份的1号
     *
     * @param pattern
     * @return
     * @throws Exception
     */
    public static String getNextMonthFirstDate(String pattern) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.MONTH, 1);
        Date time = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(time);
    }

    /**
     * 获取前一年或后一年时间
     *
     * @param dateStr
     * @param dateType
     * @param dateType2
     * @param parameter
     * @return
     * @throws Exception
     */
    public static String stringConversionStringDate(String dateStr, String dateType, String dateType2, int parameter) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(dateType);
        SimpleDateFormat format = new SimpleDateFormat(dateType2);
        Date date = sdf.parse(dateStr);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.YEAR, parameter);
        Date y = c.getTime();
        String conversionDate = format.format(y);
        return conversionDate;
    }

    /**
     * 获取当前时间的前2小时的时间
     *
     * @throws Exception
     */
    public void getBefore2Hour() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH");
        String startTime = df.format(new Date()) + ":00:00";
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 2);
        String endTime = df.format(calendar.getTime()) + ":00:00";
    }

    /**
     * 求出入参时间的本周时间数组
     */
    public static String[] getTimeWeekDayArray(String startDate, String typeR ,String typeC) throws ParseException {
        SimpleDateFormat sfR = new SimpleDateFormat(typeR);
        SimpleDateFormat sfC = new SimpleDateFormat(typeC);
        String[] weekDayArray = new String[7];
        for (int i = 0; i < 7; i++) {
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(sfR.parse(startDate));
            cal1.set(cal1.DAY_OF_WEEK, cal1.MONDAY);
            cal1.set(Calendar.DATE, cal1.get(cal1.DATE) + i);
            String time = sfC.format(cal1.getTime());
            weekDayArray[i] = time;
        }
        return weekDayArray;
    }
}
