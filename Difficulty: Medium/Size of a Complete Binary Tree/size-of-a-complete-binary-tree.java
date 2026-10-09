class Solution {

    public int countNodes(Node root) {
        // code here
        if(root==null) return 0;
        
        int left = getLeftHeight(root);
        int right = getRightHeight(root);
        
        if(left==right){
            return (1<<left) - 1;
        }
        
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
    public int getLeftHeight(Node root){
        int count = 0;
        
        while(root != null){
            count++;
            root = root.left;
        }
        return count;
    }
    
    public int getRightHeight(Node root){
        int count = 0;
        
        while(root != null){
            count++;
            root = root.right;
        }
        return count;
    }
}