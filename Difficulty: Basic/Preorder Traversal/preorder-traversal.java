/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> preorder = new ArrayList<>();
        if(root==null) return preorder;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            preorder.add(root.data);
            if(root.right != null){
                stack.add(root.right);
            }
            if(root.left != null){
                stack.add(root.left);
            }
        }
        return preorder;
    }
}