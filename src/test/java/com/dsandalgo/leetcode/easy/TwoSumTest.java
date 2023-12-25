package com.dsandalgo.leetcode.easy;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @project : IntelliJ IDEA
 * @Author : Abhijit on 25/12/2023
 */

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice. *
 * You can return the answer in any order.
 *
 * Example 1: *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2: *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3: *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSumTest {


    @ParameterizedTest
    @MethodSource("provideTwoSumExamplesSolutionTestArguments")
    void testTwoSumExamplesSolution(TwoSum.Solution solution, int[] inputArray, int target, int[] expected) {
        //When
        int[] actual = solution.twoSum(inputArray, target);
        //Then
        assertArrayEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideTwoSumExamplesSolution1TestArguments")
    void testTwoSumExamplesSolution1(TwoSum.Solution1 solution1, int[] inputArray, int target, int[] expected) {
        //When
        int[] actual = solution1.twoSum(inputArray, target);
        //Then
        assertArrayEquals(expected, actual);
    }

     static Stream<Arguments> provideTwoSumExamplesSolutionTestArguments() {
        TwoSum.Solution solution = getSolution();
        TwoSum.Solution1 solution1 = new TwoSum().new Solution1();
        return Stream.of(Arguments.of(solution, new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                         Arguments.of(solution, new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                         Arguments.of(solution, new int[]{3, 3}, 6, new int[]{0, 1}));
    }

    static Stream<Arguments> provideTwoSumExamplesSolution1TestArguments() {
        TwoSum.Solution1 solution1 = new TwoSum().new Solution1();
        return Stream.of(Arguments.of(solution1, new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(solution1, new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(solution1, new int[]{3, 3}, 6, new int[]{0, 1}));
    }

    private static TwoSum.Solution getSolution() {
        return new TwoSum().new Solution();
    }
}
