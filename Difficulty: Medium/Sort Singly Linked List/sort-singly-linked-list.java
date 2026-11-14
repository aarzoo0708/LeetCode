/* Structure of a Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
       data = d;
       next = null;
    }
}*/
class Solution {
    Node findMiddle(Node head){
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    Node mergeTwo(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        
        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            
            temp = temp.next;
        }
        
        if(l1 != null) temp.next = l1;
        if(l2 != null) temp.next = l2;
        
        return dummy.next;
    }
    
    public Node sortLL(Node head) {
        // code here
        if(head == null || head.next == null) return head;
        Node middle = findMiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = head;
        
        left = sortLL(left);
        right = sortLL(right);
        
        return mergeTwo(left,right);
    }
}