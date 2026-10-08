/* Structure of binary tree node
class Node{
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}*/

class Solution {
    int findMaxSum(Node root) {
        // code here
        int maxi[] = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        maxPath(root, maxi);
        return maxi[0];
    }
    
    int maxPath(Node root, int[] maxi){
        if(root==null) return 0;
        
        int leftSum = Math.max(0, maxPath(root.left, maxi));
        int rightSum = Math.max(0, maxPath(root.right, maxi));
        
        maxi[0] = Math.max(maxi[0], root.data + leftSum + rightSum);
        
        return root.data + Math.max(leftSum, rightSum);
    }
}