/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
   }
} */

class Solution {
    Node findtail(Node temp, int a){
        int count = 1;
        while(temp != null){
            if(count==a) return temp;
            count++;
            temp = temp.next;
        }
        return temp;
    }
    public Node rotate(Node head, int k) {
        // code here
        if(head==null || k==0) return head;
        Node tail = head;
        int len = 1;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        if(k%len==0) return head;
        k = k % len;
        
        Node newTail = findtail(head, k);
        tail.next = head;
        head = newTail.next;
        newTail.next = null;
        
        return head;
    }
}