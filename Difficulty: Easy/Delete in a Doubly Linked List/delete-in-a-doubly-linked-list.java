/* Structure of a Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = prev = null;
    }
}*/

class Solution {
    public Node delPos(Node head, int k) {
        // code here
        int count = 1;
        Node temp = head;
        while(temp!=null){
            if(count == k){
                break;
            }
            temp = temp.next;
            count++;
        }
        Node back = temp.prev;
        Node front = temp.next;
        
        if(back==null && front == null) return null;
        else if(back == null){
            head = head.next;
            head.prev = null;
        }
        else if(front == null){
            back.next = null;
            temp.prev = null;
        }
        else{
            back.next = front;
            front.prev = back;
            temp.prev = null;
            temp.next = null;
        }
        return head;
    }
}