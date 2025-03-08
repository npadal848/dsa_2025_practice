package com.np.practice.gfg;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateWithoutExtraSpace {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 6, 3, 6, 1};
//        int[] nums = {1, 2, 3, 4, 3};
        int[] nums = {1, 2, 2, 1, 3};
        System.out.println(findDuplicates(nums));
    }

    //This solution works for a duplicate element which appeared twice in the array
    public static List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]);
            if(nums[index] < 0){
                int ele = Math.abs(nums[i]);
                duplicates.add(ele);
            }else {
                nums[index] *= -1;
            }
        }

        return duplicates;
    }
}
