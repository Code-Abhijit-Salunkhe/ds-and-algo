package com.dsandalgo.leetcode.easy;

import java.util.HashMap;
import java.util.Map;


/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice. *
 * You can return the answer in any order.
 * Example 1: *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2: *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3: *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {
    private TwoSum(){
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Brute force
     * Time Complexity : B(O) = n square
     *
     */
    public static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for(int i = 0; i < nums.length - 1; i++)
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            return result;
        }
    }

    /**
     *  Using HashMap and Complement - FAST Solution
     */
    public static class Solution1 {

        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            Map<Integer, Integer> complementMap = new HashMap<>();
            for(int i = 0; i < nums.length; i++) {
                Integer complementIdx = complementMap.get(nums[i]);
                if(complementIdx != null){
                    result[0] = complementIdx;
                    result[1] = i;
                    break;
                }
                complementMap.put(target - nums[i], i);
            }
            return result;
        }
    }


}
