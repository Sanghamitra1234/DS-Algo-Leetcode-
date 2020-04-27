//QuestionLink : https://leetcode.com/problems/evaluate-reverse-polish-notation/

//Asked in EY interview for entry level java programmer prev year


class Solution {
    public int evalRPN(String[] s) {
        if(s.length==0){
            return 0;
        }
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<s.length;i++){
            if(s[i].matches("^[-+]?\\d+(\\.\\d+)?$")){
                st.push(Integer.parseInt(s[i]));
            }
            else{
                System.out.println(s[i]);
                int a=st.pop();
                int b=st.pop();
                
                if(s[i].equals("+")){
                    st.push(a+b);
                }else if(s[i].equals("-") ){
                    st.push(b-a);
                }else if(s[i].equals("*") ){
                    st.push(a*b);
                }else if(s[i].equals("/")){
                    st.push(b/a);
                }
            }

        }
       // return 0; 
      return st.pop();    
    }
       
}