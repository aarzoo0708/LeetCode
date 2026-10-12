/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean search(Node root, int key) {
        // code here
        while(root.data!=key){
            
                    root = key < root.data ? root.left : root.right;
                    if(root==null){
                return false;
            }
                }
                return true;
    }
}