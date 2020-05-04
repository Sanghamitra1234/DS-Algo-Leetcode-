//QuestionLink:https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/

//"Bad Solution triggers"

class Solution {
    public int findComplement(int num) {
        if(num==0){
            return 1;
        }
        String binaryFormat=binary(num);
        int k=0;
        int ans=0;
        for(int i=binaryFormat.length()-1;i>=0;i--){
            char ch=binaryFormat.charAt(i);
            if(ch=='1'){
                ans+=Math.pow(2,k);
            }
            k++;
        }
        //System.out.println(binaryFormat);
        return ans;
    }
    public String binary(int num){
        if(num==0) return "0";
        if(num%2==0) return binary(num/2)+"1";
        else return binary(num/2)+"0";
        
    }
}