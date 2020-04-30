//QuestionLink:https://leetcode.com/problems/wiggle-subsequence/

class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length<2){
            return nums.length;
        }
        
        int [] diff=new int[nums.length-1];
        //int count=0;
        int k=0;
        
        
        for(int i=0;i<nums.length-1 && k<diff.length;i++,k++){
            diff[k]=nums[i+1]-nums[i];
            //k++;
        }
        int count = diff[0] != 0 ? 2 : 1;
       
        
        int prevDiff=diff[0];
        for(int i=1;i<diff.length;i++){
            if(prevDiff >= 0 && diff[i]< 0 || prevDiff <= 0 && diff[i] > 0 ){
                count++;
                prevDiff=diff[i];
            }
        }
       // System.out.println(Arrays.toString(diff));
        
        return count;
    }
}