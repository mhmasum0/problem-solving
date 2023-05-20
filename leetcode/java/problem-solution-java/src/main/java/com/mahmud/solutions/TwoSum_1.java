package com.mahmud.solutions;

public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if (i != j){
                    int sum = nums[i] + nums[j];
                    if ( sum == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=i; j<nums.length; j++){
                if (i != j){
                    int sum = nums[i] + nums[j];
                    if ( sum == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }

}
