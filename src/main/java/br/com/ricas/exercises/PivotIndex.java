package br.com.ricas.exercises;

import java.util.Arrays;
/*
* Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11*/
public class PivotIndex {
    public int pivot(int[] numbers) {

        int total = Arrays.stream(numbers).sum();
        int leftSum = 0;
        for (int i = 0; i < numbers.length; i++) {

            int rightSum = total - numbers[i] - leftSum;

            if (leftSum == rightSum)
                return i;

            leftSum += numbers[i];
        }
        return -1;
    }
    private int recursion(int[] numbers, int index, int left, int right) {
        for (int i = 0; i < index ; i++) {
            left+= numbers[i];
        }

        for (int i = index+1; i < numbers.length ; i++) {
            right+=numbers[i];
        }

        if (right == 0)
            return -1;

        if (left == right)
            return index;

        if (right > left)
            return recursion(numbers, index+1, 0, 0);
        return 0;
    }
}
