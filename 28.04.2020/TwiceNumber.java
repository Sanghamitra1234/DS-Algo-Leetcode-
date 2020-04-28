//QuestionLink:https://leetcode.com/problems/largest-number-at-least-twice-of-others/


class Solution {
    public int dominantIndex(int[] nums) {
        int greatest=0;
        int maxIndex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=greatest){
                greatest=Math.max(greatest,nums[i]);
                maxIndex=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[maxIndex]!=nums[i] && 2*nums[i]>nums[maxIndex]){
                return -1;
            }
        }
      
        return maxIndex;
        
    }
}