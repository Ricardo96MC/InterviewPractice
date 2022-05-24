package LeetCodeMetaTags.Easy;

import java.util.Arrays;

public class LC_1099_TwoSumLessThanK {


    /**
     *
     * run time is O(n log n) since we do sort the array rather than solving it via brute force we
     * save time sorting the initial array
     *
     */

    int[] nums = {34,23,1,24,75,33,54,8};

    public void driver() {
        System.out.println("=========== LeetCode: 1099 Two sum < K =========== " );

        System.out.println("Given an array nums of integers and integer k, return the maximum sum such that there exists " +
                "i < j with nums[i] + nums[j] = sum and sum < k. If no i, j exist satisfying this equation, return -1.");

        System.out.println("The given array is: " + Arrays.toString(nums) +" | the target is: 60"+ "\nThe expected result is: 58");
        System.out.println("The given result is: "+ solution(nums, 60));
    }

    private int solution(int[] arr, int k){
        /**
         * We want want to sort since it will take O(n log n)
         */

        Arrays.sort(arr);


        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        /**
         * Here we are grabbing the start and end value of the array and then summing them together.
         *
         * if the sum is < k we increment the left to see if we can get a value closer to k
         * we then compare it to the previous result value and take which ever is closer to k
         *
         * else the sum is > than K we decrement the biggest value
         *
         * return the result
         */

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum < k) {
                result = Math.max(sum, result);
                left++;
            } else {
                right--;
            }

        }
        return result;
    }
}
