package br.com.ricas.exercises;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [3,3], target = 6
Output: [0,1]

*/
public class TwoSum {
    public int[] oN2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;

            for (int j = i+1; j <=numbers.length-1; j++) {
                sum += numbers[i] + numbers[j];
                if (sum == target)
                    return new int[]{i, j};

                sum=0;
            }
        }
        return null;
    }

    //3,2,4
    public int[] oC(int[] numbers, int target) {
        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            Integer index = complements.get(numbers[i]);

            if (index != null) {
                return new int[] {i, index};
            }

            complements.put(target - numbers[i], i);

        }

        return numbers;
    }

}
