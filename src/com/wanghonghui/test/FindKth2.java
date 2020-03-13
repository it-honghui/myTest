package com.wanghonghui.test;

public class FindKth2 {
    private static int count;

    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = {2, 1, 3, 10, 9, 8, 7, 4, 5, 6};
        System.out.println(findKth(arr, 1));
    }

    public static int findKth(int[] arr, int k) {

        // 对数组进行排序
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(arrayToString(arr, "排序"));
        System.out.println("数组个数：" + arr.length);
        System.out.println("循环次数：" + count);

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

    /**
     * 快速排序
     *
     * @param arr   排序的数组
     * @param left  数组的前针
     * @param right 数组后针
     */
    private static void QuickSort(int[] arr, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if (left >= right) {
            return;
        }
        //设置最左边的元素为基准值
        int key = arr[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
        int i = left;
        int j = right;
        while (i < j) {
            //j向左移，直到遇到比key小的值
            while (arr[j] >= key && i < j) {
                j--;
            }
            //i向右移，直到遇到比key大的值
            while (arr[i] <= key && i < j) {
                i++;
            }
            //i和j指向的元素交换
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        count++;
        QuickSort(arr, left, i - 1);
        QuickSort(arr, i + 1, right);
    }

    /**
     * 将一个int类型数组转化为字符串
     *
     * @param arr
     * @param flag
     * @return
     */
    public static String arrayToString(int[] arr, String flag) {
        String str = "数组为(" + flag + ")：";
        for (int a : arr) {
            str += a + "\t";
        }
        return str;
    }


}
