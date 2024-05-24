package com.divyansh;


import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        // direct adding into the list
        list.add(67);
        list.add(23);
        list.add(4545);
        list.add(56);
        list.add(6777);
        list.add(888);
        list.add(433);

        //input using loops
        for (int i = 0; i < 3; i++) {
            list.add(in.nextInt());

        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
