//QuestionLink: https://leetcode.com/problems/online-stock-span/

//Tried two stack to keep in increasing way, but this question just needs to consider weights

class StockSpanner {
    Stack<Integer> s1,s2;
    public StockSpanner() {
        
       s1=new Stack();
       s2=new Stack();
    }
    
    public int next(int price) {
        int w=1;
        while(!s1.isEmpty() && s1.peek()<=price){
            s1.pop();
            w+=s2.pop();
        }
        s1.push(price);
        s2.push(w);
        return w;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */