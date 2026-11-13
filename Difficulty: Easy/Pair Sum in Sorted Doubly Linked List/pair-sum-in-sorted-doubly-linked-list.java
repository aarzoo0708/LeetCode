/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        if(head==null) return null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node right = temp;
        Node left = head;
        
        ArrayList<ArrayList<Integer>> ds = new ArrayList<>();
        while(left.data < right.data){
            ArrayList<Integer> arr = new ArrayList<>();
            if(left.data + right.data == target){
                arr.add(left.data);
                arr.add(right.data);
                ds.add(arr);
                left = left.next;
                right = right.prev;
            }
            else if(left.data + right.data > target){
                right = right.prev;
            }
            else{
                left = left.next;
            }
        }
        return ds;
    }
}