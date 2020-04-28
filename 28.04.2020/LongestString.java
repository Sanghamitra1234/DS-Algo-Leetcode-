//QuestionLink:https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/

class Solution {
    public String findLongestWord(String s, List<String> d) {
        String [] s1=s.split("");
        //Arrays.sort(s1);
        int length=0;
        String ans="";
        for(int i=0;i<d.size();i++){
            
            int compareLength=compare(s1,d.get(i));
            //System.out.println(compareLength+" "+ans+ " "+length);
            if(compareLength>length){
                ans=d.get(i);
                length=compareLength;
            }
            else if(compareLength==length){
                if(ans.compareTo(d.get(i))>0){
                    ans=d.get(i);
                }
            }
        }
        return ans;
    }
    public int compare(String [] s, String p1){
        String [] p=p1.split("");
        //Arrays.sort(p);
        int i=0;
        int j=0;
        while(i<s.length && j<p.length){
            if(s[i].equals(p[j])){
                j++;
            }
            i++;
        }
        //System.out.println(Arrays.toString(s)+"" +Arrays.toString(p)+" "+j);
        if(j==p.length){
            return p.length;
        }
        return 0;
    }
}