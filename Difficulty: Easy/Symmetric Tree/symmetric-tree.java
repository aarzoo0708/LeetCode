/* Structure of binary tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }

    public boolean isSymmetricHelp(Node left, Node right){
        if(left==null || right == null){
            return left == right;
        }

        if(left.data != right.data){
            return false;
        }

        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}