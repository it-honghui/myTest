package com.wanghonghui.test;

public class FindKth {

    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = {2, 1, 3, 10, 9, 8, 7, 4, 5, 6};
        System.out.println(findKth(arr, 1));
    }

    public static int findKth(int[] arr, int k) {

        // 对数组进行排序
        if (arr != null) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        // 思路就是直接从排序的数组中找奇数
        // 我们遍历数组，这个a就是第几个小的奇数，然后每次都与k比较，如果是就返回
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {//说明是个奇数
                if (a == k) { //如果第a小的数是想要k，那么就可以返回了
                    return arr[i];
                }
                a++;
            }
        }

        // 返回结果
        return 0;
    }

}
