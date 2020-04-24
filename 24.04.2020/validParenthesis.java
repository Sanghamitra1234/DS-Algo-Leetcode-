//QuestionLink:https://leetcode.com/problems/valid-parentheses/

//This is a very popular question.

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            //System.out.println(st);
            char c= s.charAt(i);
            
             if(isClosing(st,c)){
                st.pop();
            }else{
                 st.push(c);
             }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
        
    }
    public boolean isOpeningBracket(char c){
        if(c=='('|| c=='['  || c=='{'){
            return true;
        }
        return false;
    }
    public boolean isClosing(Stack<Character> st, char c){
        if(!st.isEmpty()){
            if(c==')' && st.peek()=='('){
                return true;
            }else if(c==']' && st.peek()=='['){
                return true;
            }else if(c=='}' && st.peek()=='{'){
                return true;
            }
        }
        return false;
    }
}