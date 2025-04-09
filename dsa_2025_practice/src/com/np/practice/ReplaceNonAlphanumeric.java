package com.np.practice;

public class ReplaceNonAlphanumeric {

    public static void main(String[] args) {
        String s="sds hvsd UV862 @gmail.com";
        System.out.println(replaceAll(s));
    }

    public static String replaceAll(String s){
        String temp = s.toLowerCase();
        return temp.replaceAll("[^A-Za-z0-9]", "");
    }
}
