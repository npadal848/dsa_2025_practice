package com.np.practice.azdsasheet.basicMathProblems.recursion;

public class CheckStringPalindrome {

    public static void main(String[] args) {
        String s = "abccba";
        System.out.println(checkPalindrome(s, 0, s.length()-1));
    }

    private static boolean checkPalindrome(String s, int l, int r){
        if(l>=r)
            return true;
        else if(s.charAt(l) != s.charAt(r))
            return false;
        return checkPalindrome(s, l+1, r-1);
    }
}
