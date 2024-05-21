package com.divyansh;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2D {
    public static void main(String[] args) {
        // declairing
//        int[][] arr = new int[5][];
        // direct
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {6,7,8}
        };
        Scanner in = new Scanner(System.in);
//        for entering the 2D arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }

        }

        // same
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        //same
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
