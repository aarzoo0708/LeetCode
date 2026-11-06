/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
} */
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        if(head==null){
            if(pos==1) return new Node(val);
            else return null;
        }
        
        if(pos==1){
            Node temp = new Node(val);
            temp.next = head;
            return temp;
        }
        
        int count = 1;
        Node temp = head;
        while(temp != null && count<pos){
            if(count==pos-1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
}