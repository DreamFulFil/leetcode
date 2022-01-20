package org.dream.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int num1 = nums[currentIndex];
            int num2 = target - num1;
            if(map.containsKey(num2)) {
               Integer num2Index = map.get(num2); 
               if(num2Index != currentIndex) {
                   return new int[] { num2Index, currentIndex };
               }
            }
            map.put(nums[currentIndex], currentIndex);
        }
        return new int[0];   
    }

}
