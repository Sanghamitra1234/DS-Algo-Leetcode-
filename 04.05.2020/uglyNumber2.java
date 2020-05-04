//QuestionLink:https://leetcode.com/problems/ugly-number-ii/

class Solution {
    public int nthUglyNumber(int n) {
        if(n<=6){
            return n;
        }
        TreeSet<Long> t=new TreeSet<>();
        t.add((long)1);
        long temp=0;
        for(int i=0;i<n;i++){
            
            temp=t.first();
           // System.out.println(temp);
            t.add(temp*2);
            t.add(temp*3);
            t.add(temp*5);
            t.remove(temp);
        }
        
        return (int)temp;
    }
}