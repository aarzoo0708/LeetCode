/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node temp = head;
        Node zero = new Node(-1);
        Node zeroHead = zero;
        Node one = new Node(-1);
        Node oneHead = one;
        Node two = new Node(-1);
        Node twoHead = two;
        
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }
            else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
            
        }
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;    
        return zeroHead.next;
        
        
    }
}