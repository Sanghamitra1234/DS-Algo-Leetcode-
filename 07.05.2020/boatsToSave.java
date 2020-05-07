//QuestionLonk:https://leetcode.com/problems/boats-to-save-people/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats=0;
        //int limitReached=0;
        int start=0;
        int end=people.length-1;
        Arrays.sort(people);
        while(start<=end){
            if(start==end){
                boats++;
                return boats;
            }else if(people[start]+people[end]<=limit){
                 start++;
            }
            boats++;
            end--;
        }
        return boats;
    }
}