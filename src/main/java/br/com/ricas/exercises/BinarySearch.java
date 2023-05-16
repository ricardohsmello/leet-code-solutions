package br.com.ricas.exercises;

/*
*
* Given an array of integers nums which is sorted in ascending order,
*  and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
* */
public class BinarySearch {
    public int search(int[] nums, int target) {

        /*
        * 1. Divided nums to get the middle position.
        * 2. Verify if middle value is greater than target
        * 3. If true, I pass the second part of array and divide by middle
        *
        *     -1,0,3,|5|,9,12
        *      if 5 == target
        *          return position
        *
        *     if 5 > target
        *       target will be on the leftPart of array
        *
        *     target will be on the rightPart of array
        *
        * */
        return recursive(nums, target, 0, nums.length -1);
    }

    public int recursive(int[] nums, int target, int min, int max) {
        int middle = (min + max) / 2;
        int currentNumber = nums[middle];
        if (min > max) {
            return -1;
        }

        if (currentNumber == target)
            return middle;

        if (target < currentNumber) {
            return recursive(nums, target, min, middle - 1);
        } else {
            return recursive(nums, target, middle + 1, max);
        }
    }
}


/*
*
* Input: root = [3,9,20,null,null,15,7]

*             3
*      9            20
*                 15   7
*
 * */
