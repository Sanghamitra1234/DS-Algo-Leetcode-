//QuestionLink:https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/

class Solution {
    public int minStartValue(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        
        int prefix=Integer.MAX_VALUE;
        int prev=0;
        for(int i=0;i<nums.length;i++){
            
            prev+=nums[i];
            System.out.println(prev);
            prefix=Math.min(prefix,prev);
        }
        
        
        if(prefix<0){
            return (1-prefix);
        }
        
        
        return 1;
    }
}