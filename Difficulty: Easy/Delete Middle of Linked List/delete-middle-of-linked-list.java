/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        if(head==null || head.next==null) return null;
        
        Node fast = head;
        Node slow = head;
        fast = fast.next.next;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return head;
    }
}