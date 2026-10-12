/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public Node insert(Node root, int key) {
        
        // code here
        if(root == null) return new Node(key);
        Node curr = root;
        
        while(true){
            if(curr.data == key) break;
            if(curr.data < key){
                if(curr.right != null){
                    curr = curr.right;
                }
                else{
                    curr.right = new Node(key);
                    break;
                }
            }
            else{
                if(curr.left!=null){
                    curr = curr.left;
                }
                else{
                    curr.left = new Node(key);
                    break;
                }
            }
        }
        return root;
    }
}
