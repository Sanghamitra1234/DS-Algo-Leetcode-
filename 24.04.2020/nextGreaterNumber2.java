//QuestionLink:https://leetcode.com/problems/next-greater-element-i/


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Handling few cases 
        
        if(nums2.length==0 && nums1.length==0){
            return new int[0];
        }
        
        if(nums2.length==0){
            for(int i=0;i<nums1.length;i++){
                nums1[i]=-1;
            }
            return nums1;
        }
        
        HashMap<Integer,Integer> h=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        
        s.push(nums2[0]);
        //to Find gratest element towards right
        
        for(int i=1;i<nums2.length;i++){
            while(!s.isEmpty() && s.peek()< nums2[i]){
                h.put(s.peek(),nums2[i]);
                s.pop();
            }
            s.push(nums2[i]);
        }
        
        //Check from hashMap
        for(int i=0;i<nums1.length;i++){
            if(h.containsKey(nums1[i])){
                nums1[i]=h.get(nums1[i]);
            }else{
                nums1[i]=-1;
            }
        }
        return nums1;
    }
}