# https://leetcode.com/problems/contains-duplicate/
#Loops(its faster)
import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++){
	        if(nums[i]==nums[i+1]) return true;
        }
        return false;   
    }
}
# HashMap(its slower
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                return true;
            }else{
                hash.put(nums[i],1);
            }
        }
        return false;
    }
}
