package com.np.practice.basicMathProblems;

public class PrimNumber {

    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPrimeNumber1(n));
        System.out.println(isPrimeNumber2(n));
    }

    private static boolean isPrimeNumber1(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count==2;
    }

    private static boolean isPrimeNumber2(int n){
        int count = 0;
        int sqrtOfN = (int)Math.sqrt(n);
        for (int i = 1; i <= sqrtOfN; i++) {
            if(n%i==0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }
        return count == 2;
    }
}
