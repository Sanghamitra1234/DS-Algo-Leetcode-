//QuestionLink:https://leetcode.com/problems/sum-of-square-numbers/

class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<=2){
            return true;
        }
        //HashSet<Integer> h=new HashSet<>();
        int left=0;
        int right=(int)(Math.ceil(Math.sqrt(c)));
        
        while(left<=right){
            int target=left*left+right*right;
            if(target==c) return true;
            else if(target<c) left++;
            else right--;
        }
         return false;
    }
}