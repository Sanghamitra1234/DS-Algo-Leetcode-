//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/




class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> q=new LinkedList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        q.add(root);
        int level_1=-1;
        int level_2=-1;
        int level=0;
        while(!q.isEmpty()){
            int nodeCount=q.size();
            while(nodeCount>0){
                TreeNode temp=q.poll();
                
                if(temp!=null){
                    if(temp.val==x){
                         level_1=level;
                    }else if(temp.val==y){
                        level_2=level;
                    }
                }
                
                if(temp.left!=null){
                    q.add(temp.left);
                    h.put(temp.left.val,temp.val);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    h.put(temp.right.val,temp.val);
                }
                nodeCount--;
            }
            level++;
        }
        if(level_1==level_2 && h.get(x)!=h.get(y)){
            return true;
        }
        return false;
    }
}