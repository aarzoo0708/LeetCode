/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        Node dummy = new Node(-1);
        dummy.next = head;
        
        Node prev = dummy;
        Node temp = head;
        int count = 1;
        while(temp != null){
            if(count == k){
                prev.next = prev.next.next;
                count = 0;
            }
            
            else{
                prev = temp;
            }
            temp = temp.next;
            count++;
        }
        
        return dummy.next;
    }
}