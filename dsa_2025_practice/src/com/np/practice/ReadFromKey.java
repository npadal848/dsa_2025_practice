package com.np.practice;

import java.util.Scanner;

public class ReadFromKey {
    public static int read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        return n;
    }
}
