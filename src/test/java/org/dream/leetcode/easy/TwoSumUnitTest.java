package org.dream.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumUnitTest {
    
    @Test
    public void givenTargetNine_whentwoSum_returnsIndexZeroAndOne() {
        // Arrange
        TwoSum twoSum = new TwoSum();
        int[] array = {2, 7, 11, 15};
        int[] expected = {0, 1};
        int target = 9;

        // Act
        int[] actual = twoSum.twoSum(array, target);

        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenTargetSix_whenTwoSum_returnsIndexOneAndTwo() {
        // Arrange
        TwoSum twoSum = new TwoSum();
        int[] array = {3, 2, 4};
        int[] expected = {1, 2};
        int target = 6;

        // Act
        int[] actual = twoSum.twoSum(array, target);

        // Assert
        assertArrayEquals(expected, actual);
    }

}
