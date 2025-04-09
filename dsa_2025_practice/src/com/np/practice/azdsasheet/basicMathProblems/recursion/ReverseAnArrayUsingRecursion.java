package com.np.practice.azdsasheet.basicMathProblems.recursion;

import java.util.Arrays;

public class ReverseAnArrayUsingRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseUsingTwoParam(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(ele -> System.out.print(ele+" "));
    }

    public static void reverseUsingTwoParam(int[] arr, int l, int r){
        if(l>=r){
            return;
        }
        swap(arr, l, r);
        reverseUsingTwoParam(arr, l+1, r-1);
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r]=temp;
    }


}
