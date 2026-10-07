/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return height(root) != -1;
    }
    
    public int height(Node root){
        if(root == null) return 0;
        
        int lh = height(root.left);
        if(lh==-1) return -1;
        
        int rh = height(root.right);
        if(rh==-1) return -1;
        
        if(Math.abs(rh-lh) > 1){
            return -1;
        }
        
        return Math.max(rh,lh) + 1;
    }
}