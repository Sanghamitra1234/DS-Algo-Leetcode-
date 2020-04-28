//QuestionLink: https://leetcode.com/problems/implement-trie-prefix-tree/


//TookHelpfromHere:https://www.youtube.com/watch?v=AXjmTQ8LEoI

class Trie {

    /** Initialize your data structure here. */
    public class TrieNode{
        HashMap<Character,TrieNode> children;
        boolean endNode;
        TrieNode(){
            children=new HashMap<>();
            endNode=false;
        }
    }
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null){
               node=new TrieNode();
               current.children.put(ch,node);
            }
            current=node;
        }
        current.endNode=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null){
                return false;
            }
            current=node;
        }
        return current.endNode;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null){
                return false;
            }
            current=node;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */