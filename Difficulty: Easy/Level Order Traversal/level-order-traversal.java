/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        Queue<Node> queue = new LinkedList<Node>();
        ArrayList<Integer> level = new ArrayList<Integer>();
        if(root==null){
            return level;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                level.add(queue.poll().data);
            }
        }
        return level;
    }
}