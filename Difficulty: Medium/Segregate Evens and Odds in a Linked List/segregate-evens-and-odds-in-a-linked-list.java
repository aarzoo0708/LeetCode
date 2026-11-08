/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        
        Node temp = head;
        Node even = new Node(-1);
        Node evenTail = even;
        Node odd = new Node(-1);
        Node oddTail = odd;
        while(temp != null){
            if(temp.data %2 == 0){
                evenTail.next = temp;
                evenTail = evenTail.next;
            }
            else{
                oddTail.next = temp;
                oddTail = oddTail.next;
            }
            temp = temp.next;
        }
        evenTail.next = odd.next;
        oddTail.next = null;
        
        return even.next;
    }
}