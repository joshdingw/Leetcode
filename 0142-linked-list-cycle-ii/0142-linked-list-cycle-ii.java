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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = head;
                while(temp != fast){
                    temp = temp.next;
                    fast = fast.next;
                }
                return fast;
            }
            
        }

        // if(fast == null || fast.next == null){
        //     return null;
        // }

        // ListNode temp = head;
        // while(temp != fast){
        //     temp = temp.next;
        //     fast = fast.next;
        // }
        return null;
        
    }
}