//QuestionLink: https://leetcode.com/problems/linked-list-in-binary-tree
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(head.val==root.val){
            if(subPath(head,root)){
                return true;
            }
        }
        return isSubPath(head,root.left)|| isSubPath(head,root.right);
    }
    public boolean subPath(ListNode head, TreeNode root){
        if(head==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(head.val!=root.val){
             return false;
        }
        return subPath(head.next,root.left) || subPath(head.next,root.right);
    }
}