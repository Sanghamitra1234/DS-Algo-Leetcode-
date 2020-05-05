//https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] o1=new int[nums.length];
        int [] o2=new int[nums.length];
        o1[0]=nums[0];
        o2[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<=nums.length-1;i++){
            o1[i]=o1[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            o2[i]=o2[i+1]*nums[i];
        }
        
        System.out.println(Arrays.toString(o1));
        System.out.println(Arrays.toString(o2));
        nums[nums.length-1]=o1[nums.length-2];
        nums[0]=o2[1];
        for(int i=1;i<=nums.length-2;i++){
            nums[i]=o1[i-1]*o2[i+1];
        }
        return nums;
    }
}