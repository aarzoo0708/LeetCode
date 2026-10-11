/* Structure of a Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        HashMap<Integer, Integer> inMap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inMap.put(inorder[i], i);
        }
        
        Node root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
        return root;
    }
    
    public static Node buildTree(int preorder[], int preStart, int preEnd, int inorder[], int inStart, int inEnd, HashMap<Integer, Integer> inMap){
        
        if(preStart > preEnd || inStart > inEnd) return null;
        
        Node root = new Node(preorder[preStart]);
        
        int inRoot = inMap.get(root.data);
        int numsLeft = inRoot - inStart;
        
        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot-1, inMap);
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);
        
        return root;
    }
}