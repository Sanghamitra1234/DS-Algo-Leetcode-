//QuestionLink:https://leetcode.com/problems/delete-operation-for-two-strings/


class Solution {
    public int minDistance(String word1, String word2) {
        int lcs=longestCommonSubsequence(word1,word2);
        
            return Math.abs(0-(word1.length()-lcs+word2.length()-lcs));
        
       
    }
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.length()==0){
            return text2.length();
        }else if(text2.length()==0){
            return text1.length();
        }
        
        int [][] dp=new int [text1.length()+1][text2.length()+1];
        
        for(int i=1;i<=text1.length();i++){
             for(int j=1;j<=text2.length();j++){
                 if(text1.charAt(i-1)==text2.charAt(j-1)){
                     dp[i][j]=dp[i-1][j-1]+1;
                 }else{
                     dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                 }
             }
        }
        return dp[dp.length-1][dp[0].length-1];
        
    }
}