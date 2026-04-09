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
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s1 = head;
        ListNode s2 = head;

        while( s2 != null && s2.next!= null ){
            s1 = s1.next;
            s2 = s2.next.next;
            if(s1 == s2){
                return true;
            }
        }return false;
        
        
    }
}