//QuestionLink : https://leetcode.com/problems/minimum-path-sum

//used recusrsion with extra space. :( 

class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        if(grid.length==1 && grid[0].length==1){
            return grid[grid.length-1][grid[0].length-1];
        }
        int ans=0;
        int [][] a=new int[grid.length][grid[0].length];
        
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         a[i][j]=-1;
        //     }
        // }
        return minPathSumUtil(grid,0,0,a);
    }
    public int minPathSumUtil(int [][]grid,int m,int n,int [][] a){
        //int c=0;
       
        if(m >= grid.length || n>= grid[0].length){
            return Integer.MAX_VALUE;
        }
        if (m == grid.length - 1 && n == grid[0].length - 1) {
           // System.out.println(m+" "+n+" "+ " "+ a[m][n]+" BBHIPO ");
            return grid[m][n];
        }
        
        if(a[m][n]==0){
            
               a[m][n]=grid[m][n]+Math.min( minPathSumUtil(grid,m+1,n,a),                                                       minPathSumUtil(grid,m,n+1,a));
             //System.out.println(m+" "+n+" "+ " "+ a[m][n]);
            
        }
        System.out.println(m+" "+n+" "+ " "+ a[m][n]);
        return a[m][n] ;
    }
}