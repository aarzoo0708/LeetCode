/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int findLength(Node slow, Node fast){
        int count = 1;
        fast = fast.next;
        while(slow != fast){
            count++;
            fast = fast.next;
        }
        return count;
    }
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) return findLength(slow, fast);
        }
        return 0;
    }
}