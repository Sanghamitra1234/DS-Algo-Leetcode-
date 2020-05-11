//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3325/

class Solution {
    public int findJudge(int N, int[][] trust) {
        int [] in=new int[N+1];
        int [] out=new int [N+1];
        in[0]=-1;
        out[0]=-1;
        for(int i=0;i<trust.length;i++){
            
          in[trust[i][1]]+=1;
          out[trust[i][0]]+=1;
        }
        for(int i=1;i<=N;i++){
          //  System.out.println(in[i]+" "+out[i]);
            if(in[i]==N-1 && out[i]==0){
                return i;
            }
        }
        return -1;
    }
}