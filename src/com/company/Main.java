package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = in.nextInt(), tmp = 1;
        if (a <= 10) {

            for (int i = 1; i <= a; i++) {
                tmp = tmp * i;
                // System.out.println(tmp);
            }
            System.out.print(tmp);
        } else {
            System.out.print("The number must be <10");
        }
    }
}
