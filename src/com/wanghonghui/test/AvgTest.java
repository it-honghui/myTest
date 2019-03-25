package com.wanghonghui.test;

public class AvgTest {
    /**
     * 平均数
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        int n = 0;
        double ave = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            n = n + 1;
        }
        ave = sum / (n * 1.0);
        System.out.println(ave);
    }
}
