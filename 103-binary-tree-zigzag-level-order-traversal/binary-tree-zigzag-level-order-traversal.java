/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        if(root==null) return result;

        boolean leftToRight = true;

        queue.offer(root);

        while(!queue.isEmpty()){
            int len = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<len; i++){
            if(queue.peek().left!=null){
                queue.offer(queue.peek().left);
            }

            if(queue.peek().right!=null){
                queue.offer(queue.peek().right);
            }

            if(leftToRight){
                list.add(queue.poll().val);
            }
            else{
                list.add(0, queue.poll().val);
            }
            }
            
            result.add(list);
            leftToRight = !leftToRight;
        }
        return result;
    }
}