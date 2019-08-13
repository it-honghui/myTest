package com.wanghonghui.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayCopyTest {
    public static void main(String[] args) {
        String[] q11_r1_shengrou = {"Q41", "Q42", "Q43a", "Q43b", "Q43c", "Q44a", "Q44b", "Q44c", "Q45", "Q46"};//生肉
        String[] q11_r2_jiaqin = {"Q50", "Q51", "Q52", "Q53", "Q54", "Q55"};//家禽
        String[] q11_r3_shuichan = {"Q87", "Q88", "Q89a", "Q90a", "Q91", "Q91b"};//水产
        String[] q11_r4_shucai = {"Q77", "Q78", "Q79", "Q80", "Q80b"};//蔬菜
        String[] q11_r5_shuiguo = {"Q71", "Q72", "Q73", "Q74", "Q75", "Q75b"};//水果
        String[] q11_r6_shushi = {"Q82", "Q83", "Q84", "Q85", "Q86"};//熟食
        String[] q11_r8_nai = {"Q63", "Q64", "Q65", "Q66", "Q67", "Q68"};//奶
        String[] q11_r9_dan = {"Q56", "Q57", "Q58", "Q59", "Q60", "Q61"};//蛋
        String[] q11_r10_sudongshipin = {"Q209", "Q210", "Q211", "Q212", "Q213", "Q214"};//速冻食品
        String[] q11_r11_yinliao = {"Q187", "Q188", "Q189", "Q190", "Q191", "Q192"};//饮料
        String[] q11_r13_shipin = {"Q181", "Q182", "Q183", "Q184", "Q185", "Q186"};//食品
        String[] q11_r14_mimian = {"Q130", "Q131", "Q132", "Q133", "Q134", "Q135"};//米面
        String[] q11_r15_shiyongyou = {"Q136", "Q137", "Q138", "Q139", "Q140", "Q141"};//食用油
        String[] q11_r16_tiaoweipin = {"Q142", "Q143", "Q144", "Q145", "Q146", "Q147"};//调味品
        // 将Q11题R1-R16品类绑定对应的品类题-->q11A_list
        List<String[]> q11A_list = new ArrayList<>();
        q11A_list.add(q11_r1_shengrou);
        q11A_list.add(q11_r2_jiaqin);
        q11A_list.add(q11_r3_shuichan);
        q11A_list.add(q11_r4_shucai);
        q11A_list.add(q11_r5_shuiguo);
        q11A_list.add(q11_r6_shushi);
        q11A_list.add(q11_r8_nai);
        q11A_list.add(q11_r9_dan);
        q11A_list.add(q11_r10_sudongshipin);
        q11A_list.add(q11_r11_yinliao);
        q11A_list.add(q11_r13_shipin);
        q11A_list.add(q11_r14_mimian);
        q11A_list.add(q11_r15_shiyongyou);
        q11A_list.add(q11_r16_tiaoweipin);

        Collections.shuffle(q11A_list);
        List<String[]> q11A = q11A_list.subList(0, 2);


        String[] str1 = q11A.get(0);
        String[] str2 = q11A.get(1);
        String[] str3 = new String[str1.length + str2.length];

        //将数组1放到目标数组中，参数为：
        // 1.将要复制的数组  2.从将要复制的数组的第几个元素开始  3.目标数组   4.将要放到目标数组的那个位置   5.复制多少个元素
        System.arraycopy(str1, 0, str3, 0, str1.length);
        //复制数组2到目标数组中
        System.arraycopy(str2, 0, str3, str1.length, str2.length);
        //循环输出看
        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }

    }
}
