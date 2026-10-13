/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node preToBST(int pre[]) {
        // code here
        return preToBST(pre, Integer.MAX_VALUE, new int[]{0});   
    }
    
    public Node preToBST(int A[], int bound, int[] i){
        if(i[0] == A.length || A[i[0]] > bound) return null;
        
        Node root = new Node(A[i[0]++]);
        root.left = preToBST(A, root.data, i);
        root.right = preToBST(A, bound, i);
        return root;
    }
}