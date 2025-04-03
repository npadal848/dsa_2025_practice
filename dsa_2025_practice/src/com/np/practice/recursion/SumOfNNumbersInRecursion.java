package com.np.practice.recursion;

import com.np.practice.ReadFromKey;

public class SumOfNNumbersInRecursion {

    public static void main(String[] args) {
        int n = ReadFromKey.read();
        System.out.println(sum(n));
    }

    private static int sum(int n){
        if(n==1){
            return 1;
        }else {
            return n + sum(n-1);
        }
    }
}
