# Product of Array Except Self
# https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int pro=1;
       for(int j=nums.length-1;j>=0;j--){
            result[j]=pro;
             pro= pro*nums[j];  
        }
        pro=1;
        for(int i=0;i<nums.length;++i){
            result[i]=result[i]*pro;
            pro= pro*nums[i];
            
        }
        return result;
        
    }
}
