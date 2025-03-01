package com.np.practice.leetcode41;

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        int nums[] = {1, 1};

//        System.out.println(firstMissingPositive(nums));
        System.out.println(firstMissingPositive2(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int result = n+1;
        //[3, 4, -1, 1]
        //result array [-3, 4, -6, -1] as you can see 1st index value is positive, so answer is index+1 which is 2 is the positive missing number
        /* Replcae all -ve elements with to n+1 to avoid confusion between present elements and -ve elements as we are converting present element to -ve */
        for(int i=0; i<n; i++){
            if(nums[i] <=0 ){
                nums[i]=n+1;
            }
        }

        //Convert present element to -ve number in its index(index=ele-1),
        for(int i=0; i<n; i++){
            int index = Math.abs(nums[i])-1;
            if(index<n){
                nums[index] *= -1;
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(nums[i]);
            if(nums[i]>0){
                return i+1;
            }
        }

        return result;
    }

    public static int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            // mark all negatives to zero, because they are not useful
            if(nums[i] < 0) nums[i] = 0;
        }
        for(int i=0;i<n;i++) {
            int ind = Math.abs(nums[i]) - 1;
            if(ind < 0 || ind >= nums.length) continue; // out of bound index
            if(nums[ind] > 0) {
                nums[ind] *= -1; // mark as visited
            } else if(nums[ind] == 0) {
                // if this index contains zero mark this visited by
                // placing any negative value
                nums[ind] = Integer.MIN_VALUE + 1;
            }
        }
        for(int i=0;i<n;i++) {
            // first non-negative index would be our answer
            if(nums[i] >= 0) return i+1;
        }
        return n+1;
    }
}
