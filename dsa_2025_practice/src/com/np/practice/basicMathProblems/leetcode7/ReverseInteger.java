package com.np.practice.basicMathProblems.leetcode7;

public class ReverseInteger {

    public static void main(String[] args) {
        int num = -123;
        System.out.println(reverse(num));
    }

    public static int reverse(int x) {
        long rev = 0;
        while(x != 0){
            int digit = x%10;
            rev = (rev*10)+digit;
            x=x/10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        }
        return (int)rev;
    }
}
