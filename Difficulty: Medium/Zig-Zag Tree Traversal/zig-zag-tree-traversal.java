/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        if(root==null) return result;
        
        queue.offer(root);
        
        boolean leftToRight = true;
        
        while(!queue.isEmpty()){
            int n = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i=0; i<n; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                if(leftToRight){
                    list.add(queue.poll().data);
                }
                else{
                    list.add(0, queue.poll().data);
                }
            }
            
            result.addAll(list);
            leftToRight = !leftToRight;
        }
        
        return result;
    }
}