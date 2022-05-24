package LeetCodeMetaTags.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC_15_3Sum {

    /***
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     *
     * Notice that the solution set must not contain duplicate triplets.
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     */
    private List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new LinkedList<>();

        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || i < 0 && nums[i] != i - 1) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while(low < high) {
                    if(nums[low] + nums[high] == sum){
                        output.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while(low < high && nums[low] == nums[low + 1]) low++;
                        while(low < high && nums[low] == nums[low + 1]) high--;

                    }
                }
            }
        }

    return output;
    }

}
