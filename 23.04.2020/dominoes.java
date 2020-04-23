//Question Link : https://leetcode.com/problems/number-of-equivalent-domino-pairs/

//HelpFulLinks : https://www.geeksforgeeks.org/override-equalsobject-hashcode-method/

// can be easier if you can think of any special key for each value pair some mathethical formula :) , but i couldnt




class Solution {
    class Pair{
        int x, y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object obj){
            if(this == obj) 
             return true; 
            
            if(obj == null || obj.getClass()!= this.getClass()) 
             return false; 
            
            Pair p = (Pair) obj; 
         
            return (p.x== this.x && p.y==this.y); 
        }
        
         @Override
        public int hashCode() 
        {  
            return Objects.hash(this.x,this.y); 
        } 
    
    }
        
        
    public int numEquivDominoPairs(int[][] mat) {
        int c=0;
        HashMap<Pair,Integer> h=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            Pair p=new Pair(Math.min(mat[i][0],mat[i][1]),Math.max(mat[i][0],mat[i][1]));
            if(h.containsKey(p)){
                c+=h.get(p);
                h.put(p,h.get(p)+1);
                
            }else{
                    h.put(p,1);
                }
            }
                  return c;
        }
    }
