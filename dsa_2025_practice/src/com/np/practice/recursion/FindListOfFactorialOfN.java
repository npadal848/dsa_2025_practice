package com.np.practice.recursion;

import java.util.ArrayList;

public class FindListOfFactorialOfN {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> list = new ArrayList();
        factorial(n, list);
        return list;
    }

    static long factorial(long n, ArrayList<Long> list){
        if(n==0){
            return 1;
        }
        long fact = n * factorial(n-1, list);
        if(fact <=n){
            list.add(fact);
        }
        return fact;
    }
}
