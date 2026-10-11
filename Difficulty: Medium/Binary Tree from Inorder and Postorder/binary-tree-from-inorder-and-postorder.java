/* Structure of binary tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public Node buildTree(int[] inorder, int[] postorder) {
        // code here
        if(inorder==null || postorder == null || inorder.length != postorder.length) return null;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        
        Node root = buildTree(inorder, 0, inorder.length -1 ,postorder, 0, postorder.length-1, map);
        return root;
    }
    
    public Node buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int pStart, int pEnd, HashMap<Integer, Integer> map){
        
        
        if(pStart > pEnd || inStart > inEnd) return null;
        
        Node root = new Node(postorder[pEnd]);
        
        int inRoot = map.get(root.data);
        int numsLeft = inRoot - inStart;
        
        root.left = buildTree(inorder, inStart, inRoot-1, postorder, pStart, pStart + numsLeft - 1, map);
        root.right = buildTree(inorder, inRoot+1, inEnd, postorder, pStart + numsLeft, pEnd - 1, map);
        return root;
    }
}