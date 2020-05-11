//https://leetcode.com/problems/number-of-lines-to-write-string/


class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int lines=1;
        int alpha=0;
        int i=0;
        while(i<S.length()){
            char ch=S.charAt(i);
            
            alpha+=widths[ch-'a'];
             if((alpha > 100)){
                //System.out.println(lines+" "+alpha);
                lines++;
                alpha=widths[ch-'a'];
            }
           // System.out.println(ch+" "+alpha+" "+lines);
            i++;
        }
        return new int[] {lines,alpha};
    }
}