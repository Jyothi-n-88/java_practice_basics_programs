//Given an integer array nums, return true if any value appears at least twice in the
//array, and return false if every element is distinct.
//Time Complexity:O(n)
//Space Complexity:O(n)
import java.util.HashSet;
class array_problem_contains_duplicate.java
{
    public static boolean containsDuplicate(int nums[])
    {
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int nums[]={1, 2, 3, 1};
        System.out.print(containsDuplicate(nums));
    }
}