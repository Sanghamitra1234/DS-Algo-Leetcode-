//https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        int res=0;
        if(num<=9){
            return num;
        }
        while(num>0){
            int digit=num%10;
            res+=digit;
            num=num/10;
        }
       return addDigits(res);
    }
}