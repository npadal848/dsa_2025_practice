package com.np.practice.leetcode22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        int n=3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate("", 0, 0, list, n);
        return list;
    }

    private static void generate(String str, int open, int close,List<String> list, int n){
        if(str.length() == 2*n){
            list.add(str);
            return;
        }

        if(open < n){
            generate(str+"(", open+1, close, list, n);
        }

        if (close < open){
            generate(str+")", open, close+1, list, n);
        }
    }
}
