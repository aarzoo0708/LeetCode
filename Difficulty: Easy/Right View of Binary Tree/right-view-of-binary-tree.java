/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        right(root, res, 0);
        return res;
    }
    
    public void right(Node curr, ArrayList<Integer> res, int level){
        if(curr == null) return;
        
        if(res.size() == level) res.add(curr.data);
        
        right(curr.right, res, level+1);
        right(curr.left, res, level + 1);
    }
}