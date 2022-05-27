import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

public class SolutionDriver {
    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[] { 1, 2, 3, 1 }));

        System.out.println(containsDuplicate(new int[] { 1, 2, 3, 4 }));

        System.out.println(containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));

    }

    public static boolean containsDuplicate(int[] nums) {
        // create empty set
        Set<Integer> set = new HashSet<Integer>();

        // for every item in nums
        for (int i : nums) {
            // if item already in set
            if (!set.add(i))
                return true;
        }
        // all items added without duplicates
        return false;

    }
}