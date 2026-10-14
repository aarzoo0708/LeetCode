/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class BSTIterator{
    Stack<Node> stack = new Stack<>();
    boolean reverse;
    
    BSTIterator(Node root, boolean reverse){
        this.reverse = reverse;
        pushAll(root);
    }
    
    public void pushAll(Node root){
        while(root != null){
            stack.push(root);
            if(reverse){
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
    }
    
    public int next(){
        Node node = stack.pop();
        if(reverse){
            pushAll(node.left);
        }
        else{
            pushAll(node.right);
        }
        return node.data;
    }
}

class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        if(root == null) return false;
        
        BSTIterator left = new BSTIterator(root, false);
        BSTIterator right = new BSTIterator(root, true);
        
        int i = left.next();
        int j = right.next();
        
        while(i<j){
            int sum = i+j;
            if(sum == target) return true;
            if(sum < target){
                i = left.next();
            }
            if(sum > target){
                j = right.next();
            }
        }
        return false;
    }
}