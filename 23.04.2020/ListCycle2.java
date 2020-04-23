
// Question Link : https://leetcode.com/problems/linked-list-cycle-ii/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Used the concept of rabit and hare to get if it is a cycle or not 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        //ListNode start=head;
        
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow == fast) {
                while (slow != head) {  //Tried to loop from head and then from slow, at some point the cycle intiation point 
                    slow = slow.next;   // will be same as head . ( Dry run in case of doubt)
                    head = head.next;
                }
                return slow;
            }
        }
        return null;
    }
}