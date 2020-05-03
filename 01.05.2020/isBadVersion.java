//QuestionLink:https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3316/


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return isBad(1,n);
    }
    public int isBad(int s, int e){
        int mid=s + (e - s) / 2;
        if(s<e){
              if(isBadVersion(mid)){
                    return isBad(s,mid);
              }else {
                    return isBad(mid+1,e);
              }
        }
       return s;
    }
}