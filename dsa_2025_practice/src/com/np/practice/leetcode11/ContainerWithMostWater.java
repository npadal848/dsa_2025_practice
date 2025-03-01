package com.np.practice.leetcode11;
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWaterContainer1(input));
    }

    // Bruteforce solution
    private static int mostWaterContainer1(int[] height){
        int max = 0;
        int n=height.length;
        for(int i=0; i< n-1; i++){
            for(int j=i+1; j< n; j++){
                max = Math.max(max, Math.min(height[i], height[j])*(j-i));
            }
        }
        return max;
    }

    private static int mostWaterContainer2(int[] height){
        int max = 0;
        int n=height.length;
        int start=0;
        int  end=n-1;
        while(start < end){
            int distance = end-start;
            if(height[start] < height[end]){
                max = Math.max(max, height[start]*(distance*2));
                start++;
            }else if(height[start] > height[end]){
                end--;
            }else{
                start++;
                end--;
            }
        }
        return max;
    }
}
