package com.np.practice.recursion;

import com.np.practice.ReadFromKey;

public class FactorialOfNInRecursion {

    public static void main(String[] args) {
        int n = ReadFromKey.read();
        System.out.println(fact(n));
    }

    private static int fact(int n){
        if(n==1){
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
}
