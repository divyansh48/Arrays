package com.divyansh;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class colnofixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }
    }
}
