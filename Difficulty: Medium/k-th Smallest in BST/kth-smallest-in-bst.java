/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int kthSmallest(Node node, int k) {
        // code here
        Stack<Node> stack = new Stack<>();
        int  count = 0;
        
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
                    count++;
                    if(count == k) return node.data;
                    node = node.right;
                }
            }
        }
        return -1;
    }
}