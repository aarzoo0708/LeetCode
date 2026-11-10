/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        
        return newHead;
    }
    
    public boolean isPalindrome(Node head) {
        // code here
        if(head == null || head.next == null) return true;
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        Node newNode = reverse(slow.next);
        Node first = head;
        Node second = newNode;
        
        while(second != null){
            if(first.data != second.data){
                reverse(newNode);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        
        reverse(newNode);
        return true;
    }
}