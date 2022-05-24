package LeetCodeMetaTags.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class LC_1_TwoSum {

    /**
     *
     *Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     * Example 1:
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    int[] nums = {2,7,11,15};

    public void driver(){
        System.out.println("=========== LeetCode: 1 Two sum ===========" );
        System.out.println("Given an array of integers nums and an integer target, return indices of the two numbers " +
                "such that they add up to target." +
                "Input: nums = [2,7,11,15], target = 9  \n+" +
                "Expected Output: [0,1]");
        System.out.println("The output is: " + Arrays.toString(twoSum(nums, 9)));
    }
    private int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length - 1; i++){
            int compliment = target - nums[i];

            if(map.containsKey(compliment))
                return new int[] {map.get(compliment), i};

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match found");
    }


    private int[] solution(int[] num, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < num.length; i++){
            // 7 = 9 -2
            //2 = 9 - 7
            int compliment = target - num[i];
            //Does map have 7?
            //does map have 2?
            if(map.containsKey(compliment))
               return new int[] {map.get(compliment), i}; //map does have so get its index and then pair it wit i from original array
            //put nums[0] in map == 2
            map.put(num[i], i);
        }
        return null;
    }

}
