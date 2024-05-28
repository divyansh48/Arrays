package com.divyansh;

public class Max {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int max1 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max1){
                max1 = arr[i];

            }

        }
        return max1;

    }
}
