/*  Binary Tree Node Structure
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public static int maxLevel(Node root) {
        // code here
        if(root == null) return 0;
        
        int lh = maxLevel(root.left);
        int rh = maxLevel(root.right);
        
        return 1 + Math.max(lh, rh);
    }
}
