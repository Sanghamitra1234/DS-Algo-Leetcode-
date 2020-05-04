//QuestionLink:https://leetcode.com/problems/ugly-number/

class Solution {
    public boolean isUgly(int num) {
        if(num==0){
            return false;
        }
        return divisible(num,0);
    }
    public boolean divisible(int n, int c){
        //System.out.println(n+" "+c);
        if(n==0 || n==1){
            return true;
        }
        while(n%5==0){
            return divisible(n/5,c+1);
        }
         while(n%3==0){
            return divisible(n/3,c+1);
        }
        while(n%2==0){
            return divisible(n/2,c+1);
        }
        return false;
    }
}