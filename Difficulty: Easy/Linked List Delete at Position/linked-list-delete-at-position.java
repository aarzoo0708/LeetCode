/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node temp = head;
        Node prev = null;
        int count = 0;
        
        if(head == null) return null;
        if(x==1) return head.next;
        
        while(temp != null){
            count ++;
            if(count == x){
                prev.next = prev.next.next;
                break;
            }
            
            prev = temp;
            temp = temp.next;
        }
        
        return head;
    }
}