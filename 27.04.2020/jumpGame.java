//QuestionLink:https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3310/

class Solution {
    public boolean canJump(int[] nums) {
        return canJumpUtil(0,nums);
    }
    public boolean canJumpUtil(int pos, int[] nums){
        //System.out.println(pos);
        
        if(pos==nums.length-1){
            return true;
        }
        for(int i=pos+1;i<=Math.min(pos+nums[pos],nums.length-1);i++){
            if(canJumpUtil(i,nums)){
                return true;
            }
        }
        return false;
    }
}