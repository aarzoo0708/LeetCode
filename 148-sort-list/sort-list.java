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
    ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    ListNode mergeTwoList(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val > l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode res = l1;
        while(l1 != null && l2 != null){
            ListNode tmp = null;
            while(l1 != null && l1.val <= l2.val){
                tmp = l1;
                l1 = l1.next;
            }
            tmp.next = l2;
            ListNode temp = l1;
            l1 = l2; 
            l2 = temp;
        }
        return res;
        // ListNode dummyNode = new ListNode(-1);
        // ListNode temp = dummyNode;
        // while(l1 != null && l2 != null){
        //     if(l1.val < l2.val){
        //         temp.next = l1;
        //         temp = l1;
        //         l1 = l1.next;
        //     }
        //     else{
        //         temp.next = l2;
        //         temp = l2;
        //         l2 = l2.next;
        //     }
        // }

        // if(l1!=null) temp.next = l1;
        // else temp.next = l2;

        // return dummyNode.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);
        return mergeTwoList(left, right);
    }
}