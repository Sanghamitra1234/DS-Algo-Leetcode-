//QuestionLink:https://leetcode.com/problems/maximum-69-number/submissions/

class Solution {
    public int maximum69Number (int num) {
        String temp = Integer.toString(num);
        int[] a = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            a[i] = temp.charAt(i) - '0';
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==6){
                a[i]=9;
                i=a.length;
            }
        }
        
        int ans=0;
        int k=0;
        for(int i=a.length-1;i>=0;i--){
            //System.out.println(ans);
            ans=ans+(int)Math.pow(10,k)*a[i];
            k++;
        }
        return ans;
    }
}