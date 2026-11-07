/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        int count = 0;
        Node temp = head;
        while(temp != null){
            if(count == p && temp.next!=null){
                Node front = temp.next;
                Node insert = new Node(x);
                temp.next = insert;
                insert.prev = temp;
                insert.next = front;
                front.prev = temp;
            }
            else if(count==p){
                Node insert = new Node(x);
                temp.next = insert;
                insert.prev = temp;
                insert.next = null;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
}