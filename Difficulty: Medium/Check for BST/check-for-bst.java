/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public boolean isBST(Node root) {
        // code here
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValid(Node root,long min,long max){
        if(root == null) return true;
        
        if(root.data >= max || root.data <= min) return false;
        
        return isValid(root.left, min, root.data) && isValid(root.right, root.data, max);
    }
}