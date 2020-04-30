//QuestionLink:https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/

class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        return helper(s,0,s.length(),k);
       //return 0;
    }
    public int helper(String s, int l, int r, int k) {
        if (l>=r) return 0;
        
        // build freq map
        int[] freq = new int[26];
        for (int i=l; i<r; i++) freq[s.charAt(i)-'a']++;
        
        // check if valid
        boolean valid = true;
        for (int i=0; i<26 && valid; i++) if (freq[i] > 0 && freq[i] < k) valid = false;
        if (valid) return r-l;
        
        // if not for each invalid character start a new split search
        int best = 0, start=l;
        for (int i=l; i<r; i++) {
            if (freq[s.charAt(i) -'a'] < k) {
                best = Math.max(best, helper(s, start, i, k));
                start = i+1;
            }
        }
        best = Math.max(best, helper(s, start, r, k));
        return best;
    }
}