//QuestionLink:https://leetcode.com/problems/teemo-attacking/

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0){
            return 0;
        }
        if(timeSeries.length==1){
            return duration;
        }
        int s=timeSeries[0];
        int e=timeSeries[0]+duration;
        int ans=0;
        for(int i=1;i<timeSeries.length;i++){
            int endTime=timeSeries[i-1]+duration;
            if(endTime>=timeSeries[i]){
                e=timeSeries[i]+duration;
            }else{
                ans+=(e-s);
                s=timeSeries[i];
                e=timeSeries[i]+duration;
            }
        }
        ans+=(e-s);
        return ans;
    }
}