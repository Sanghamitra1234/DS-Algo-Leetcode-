//QuestionsLink:https://leetcode.com/problems/merge-intervals

class Solution {
    class Meeting{
        int startTime,endTime;
        Meeting(int startTime, int endTime){
            this.startTime=startTime;
            this.endTime=endTime;
        }
    }
    class sortMeetings implements Comparator<Meeting>{
        
        public int compare(Meeting a, Meeting b){
            
            return a.startTime-b.startTime;
        }
    }
    public int[][] merge(int[][] interval) {
        if(interval.length==0){
            return new int[0][0];
        }
        ArrayList<Meeting> a=new ArrayList<>();
        ArrayList<Meeting> ans=new ArrayList<>();
        
        for(int i=0;i<interval.length;i++){
            a.add(new Meeting(interval[i][0],interval[i][1]));
        }
        
        Collections.sort(a,new sortMeetings());
        
        ans.add(a.get(0));
        
        for(int i=1;i<a.size();i++){
           Meeting currentMeeting=a.get(i);
           Meeting LastMeeting=ans.get(ans.size()-1);
            
            if(currentMeeting.startTime<=LastMeeting.endTime){
                ans.remove(ans.size()-1);
                ans.add(new Meeting(Math.min(currentMeeting.startTime,LastMeeting.startTime),
                                    Math.max(currentMeeting.endTime,LastMeeting.endTime)));
            }else{
                ans.add(currentMeeting);
            }
        }
        
        int [][] p=new int[ans.size()][2];
        for(int i=0;i<p.length;i++){
            Meeting an=ans.get(i);
            p[i][0]=an.startTime;
            p[i][1]=an.endTime;
        }
        
        return p;
    }
}