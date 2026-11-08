/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode back = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = back;
            back = curr;
            curr = next;
        }
        return back;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        head = reverse(head);

        if(n==1){
            head = head.next;
            return reverse(head);
        }

        ListNode temp = head;
        int count = 1;
        while(temp.next != null){
            if(count==n-1){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            count++;
        }
        return reverse(head);
    }
}