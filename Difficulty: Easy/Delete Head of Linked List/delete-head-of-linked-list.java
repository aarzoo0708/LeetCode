/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
} */

class Solution {
    public Node deleteHead(Node head) {
        // code here
        if(head==null || head.next==null) return null;
        Node temp = head;
        head = temp.next;
        return head;
    }
}