package com.np.practice.leetcode152;

public class MaximumProductSubArray {

    public static void main(String[] args) {
//        int nums[] = {2, 3, -2, 4};
//        int nums[] = {-2, 0, -1};
//        int nums[] = {-2};
        int nums[] = {2, 7, 0, 8, 7, -2, 4, -3};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int n=nums.length;
        int maxProduct=Integer.MIN_VALUE;
        int pref=1;
        int suf=1;
        for(int i=0; i<n; i++){
            if(pref==0) pref=1;
            if(suf==0) suf=1;
            pref *= nums[i];
            suf *= nums[n-i-1];
            maxProduct = Math.max(maxProduct, Math.max(pref, suf));
        }
        return maxProduct;
    }
}
