package org.dream.leetcode.easy;

public class TwoSum {

    public int[] twoSum(int[] array, int target) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                int num1 = array[i];
                int num2 = array[j];

                if(num1 + num2 == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];   
    }

}
