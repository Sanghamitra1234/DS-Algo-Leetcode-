//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3326/


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int prev= image[sr][sc];
        
        if(prev!=newColor) floodFillUtil(image,sr,sc,prev,newColor);
        return image;
    }
    public void floodFillUtil(int [] [] image,int x, int y, int prev, int newColour){
        // if(x==image.length-1 && y==image[0].length-1){
        //     return;
        // }
        if(x>=image.length || y>=image[0].length || x<0 || y<0){
            return ;
        }
        if(image[x][y]!=prev){
            return;
        }
        image[x][y]=newColour;
        floodFillUtil(image,x+1,y,prev,newColour);
        floodFillUtil(image,x-1,y,prev,newColour);
        floodFillUtil(image,x,y+1,prev,newColour);
        floodFillUtil(image,x,y-1,prev,newColour);
        
        
    }
}