/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public Node findLCA(Node root, Node n1, Node n2) {
        // code here
        if(root == null) return null;
        int curr = root.data;
        if(curr < n1.data && curr < n2.data){
            return findLCA(root.right, n1, n2);
        }
        else if(curr > n1.data && curr > n2.data){
            return findLCA(root.left, n1, n2);
        }
        
        return root;
    }
}