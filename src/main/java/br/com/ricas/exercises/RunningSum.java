package br.com.ricas.exercises;

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/
public class RunningSum {

    public int[] runningSum(int[] numbers) {
        int[] output = new int[numbers.length];
        int i = 0;
        output[i] = numbers[i];

        for (int j = i+1; j < numbers.length; j++) {
            i++;
            output[i] = numbers[j] + output[i-1];
        }

        return output;
    }
}
