package com.np.practice.azdsasheet.basicMathProblems;

public class FibonacciNumbers {

    public static void main(String[] args) {
        print(5);
    }

    private static void print(int n){
        int a=0;
        int b=1;
        int sum=0;

        for (int i = 0; i < n; i++) {
            System.out.println(a+" ");
            sum = a+b;
            a=b;
            b=sum;
        }
    }
}
