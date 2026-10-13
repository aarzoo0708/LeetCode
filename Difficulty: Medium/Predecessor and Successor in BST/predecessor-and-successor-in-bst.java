/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> arr = new ArrayList<>();
        Node successor = null;
        Node prede = null;
        
        Node temp = root;
        
        while(root != null){
            if(key >= root.data){
                root = root.right;
            }
            else{
                successor = root;
                root = root.left;
            }
        }
        
        while(temp != null){
            if(key <= temp.data){
                temp = temp.left;
            }
            else{
                prede = temp;
                temp = temp.right;
            }
        }
        
        
        arr.add(prede);
        arr.add(successor);
        
        return arr;
    }
}