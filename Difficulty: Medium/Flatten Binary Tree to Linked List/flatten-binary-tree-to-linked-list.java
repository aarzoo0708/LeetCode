/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public static void flatten(Node root) {
        // code here
        if(root==null) return;
        
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node curr = s.pop();
            
            if(curr.right != null) s.push(curr.right);
            if(curr.left != null) s.push(curr.left);
            if(!s.isEmpty()){
                curr.right = s.peek();
            }
            
            curr.left = null;
            
        }
    }
}