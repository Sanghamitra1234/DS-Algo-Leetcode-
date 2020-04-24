//QuestionLink:https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3304/

class Solution {
    public int search(int[] nums, int target) {
        
        return binarySearch(nums,0,nums.length-1,target);
    }
    public int binarySearch(int [] a, int l,int e, int target){
        if(l>e){
           return -1;
       }
        
        
       int mid=(l+e)/2;
       if(a[mid]==target){
           return mid;
       }
       if(a[l]<=a[mid]){
            if(target>=a[l] && a[mid]>target){
                e = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        else{
             if(target<=a[e] && a[mid]<target){
                 l = mid+1;
            }
            else{
               
                e=mid-1;
            }
        }
        return binarySearch(a,l,e,target);
    }

}