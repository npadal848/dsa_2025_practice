package com.np.practice.basicMathProblems;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisorOfANumber {

    public static void main(String[] args) {
        int n = 407;
        printAllDivisor1(n);
        System.out.println();
        printAllDivisor2(n);
    }

//    Time Complexity: O(N)
    public static void printAllDivisor1(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void printAllDivisor2(int n) {
        int squreRootOfN = (int) Math.sqrt(n);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= squreRootOfN; i++) {
            if(n % i == 0){
                list.add(i);
                int div = n/i;
                if(div != i) {
                    list.add(div);
                }
            }
        }
        list.stream().sorted().forEach(i-> System.out.print(i+" "));
    }

}
