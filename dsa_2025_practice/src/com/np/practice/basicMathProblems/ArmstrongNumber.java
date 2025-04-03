package com.np.practice.basicMathProblems;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(372));
    }

    public static boolean isArmstrongNumber(int n){
        int temp = n;
        int sum=0;
        while(temp != 0){
            int rem = temp%10;
            sum += rem*rem*rem;
            temp = temp/10;
        }
        return sum == n;
    }
}
