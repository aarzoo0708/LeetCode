/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> postorder = new ArrayList<>();
        if(root == null) return postorder;
        
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            
            if(root.left != null){
                st1.push(root.left);
            }
            if(root.right != null){
                st1.push(root.right);
            }
        }
        
        while(!st2.isEmpty()){
            root = st2.pop();
            postorder.add(root.data);
        }
        
        return postorder;
    }
}