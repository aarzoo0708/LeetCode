/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node p, Node q) {
        // code here
        if(p==null || q==null){
            return (p==q);
        }
        
        return (p.data == q.data) && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }
}