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
    Node first;
    Node middle;
    Node last;
    Node prev;
    
    public void inorder(Node root){
        if(root == null) return;
        
        inorder(root.left);
        
        if(prev != null && (prev.data > root.data)){
            if(first==null){
                first = prev;
                middle = root;
            }
            else{
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
    public Node correctBST(Node root) {
        // code here
        first = last = middle = null;
        prev = new Node(Integer.MIN_VALUE);
        inorder(root);
        
        if(first!=null && last != null){
            int t = first.data;
            first.data = last.data;
            last.data = t;
        }
        else if(first!=null && middle != null){
            int t = first.data;
            first.data = middle.data;
            middle.data = t;
        }
        return root;
    }
};