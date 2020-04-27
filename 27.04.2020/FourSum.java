//QuestionLink:https://leetcode.com/problems/4sum/


class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> aList=new ArrayList<>();
        if(nums.length<4){
            return  aList;
        }
        Arrays.sort(nums);
        
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=nums.length-1;j>=0;j--){
               int l=i+1 ,r=j-1;
                int sum=nums[i]+nums[j];
                while(l<r){
                    if(sum+nums[l]+nums[r]==target){
                ArrayList<Integer> p= new ArrayList<Integer>                              (Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        if(!aList.contains(p)){
                           aList.add(p);
                        }
                        
                        l++;
                        r--;
                    }else if(sum+nums[l]+nums[r]<target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        return aList;
    }
}