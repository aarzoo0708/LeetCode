/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> inorder = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                else{
                    node = stack.pop();
                    inorder.add(node.data);
                    node = node.right;
                }
            }
        }
        return inorder;
    }
}