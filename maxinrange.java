package com.divyansh;

public class maxinrange {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 46, 7, 8, 5};
        System.out.println(maxinrange(arr, 2, 7));

    }

    static int maxinrange(int[] arr, int start, int end) {
        int max1 = arr[start];
        for (int i = 0; i <= end; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];

            }

        }
        return max1;
    }
}
