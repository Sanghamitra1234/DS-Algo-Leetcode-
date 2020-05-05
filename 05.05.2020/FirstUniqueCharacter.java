//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320

class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> h=new HashMap<>();
        int a=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!h.containsKey(ch)){
                h.put(ch,1);
            }else{
                h.put(ch,h.get(ch)+1);
            }
        }
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(h.get(ch)==1){
                return i;
            }
        }
        return a;
        
    }
}