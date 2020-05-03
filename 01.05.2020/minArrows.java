//QuestionLink:https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/submissions/

class Solution {
    class Pair{
        
        int x,y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    class sortPair implements Comparator<Pair>{
        
        public int compare(Pair a, Pair b) 
        { 
            return a.y - b.y; 
        } 
    }
    public int findMinArrowShots(int[][] points) {
        if(points.length<=1){
            return points.length;
        }
        
        ArrayList<Pair> a=new ArrayList<>();
        for(int i=0;i<points.length;i++){
            a.add(new Pair(points[i][0],points[i][1]));
        }
        Collections.sort(a,new sortPair());
        int prev=a.get(0).y;
        int ans=1;
        for(int i=1;i<a.size();i++){
            
            if(prev >= a.get(i).x ){
                continue;
            }else{
                ans++;
                prev=a.get(i).y;
            }
        }
        return ans;
        
    }
}