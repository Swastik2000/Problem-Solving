// https://leetcode.com/problems/two-sum/
//
//	Brute Force Method

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        for(int i=0;i<nums.length-1;++i){
            for(int j=i+1; j< nums.length;++j){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                        break;
                }
            }
        }
        return res;
        
    }
}

// Two pointer approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        
        Arrays.sort(nums);
        int p1=0, p2=nums.length-1;
        while(p1<p2){
        if(nums[p1]+nums[p2]==target){
            res[0]=p1;
            res[1]=p2;
            
        }
        else if(nums[p1]+nums[p2]<target){
            p1++;
        }
        
        else {
            p2--;}
        }
        
        return res;
        
    }
}

// Hashing method
