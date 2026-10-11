/* Structure of binary tree node
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
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        if(root == null) return arr;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node == null){
                arr.add(null);
                continue;
            }
            
            arr.add(node.data);
            q.add(node.left);
            q.add(node.right);
        }
        return arr;
        
    }

    public Node deSerialize(ArrayList<Integer> arr) {
        
        
        // code here
        if(arr.size() == 0) return null;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr.get(0));
        q.add(root);
        
        for(int i=1; i<arr.size(); i++){
            Node parent = q.poll();
            if(arr.get(i) != null){
                Node left = new Node(arr.get(i));
                parent.left = left;
                q.add(left);
            }
            
            if(arr.get(++i) != null){
                Node right = new Node(arr.get(i));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }
};