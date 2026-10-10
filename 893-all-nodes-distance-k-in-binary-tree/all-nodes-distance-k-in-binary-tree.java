
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current.left != null) {
                parent.put(current.left, current);
                queue.offer(current.left);
            }

            if (current.right != null) {
                parent.put(current.right, current);
                queue.offer(current.right);
            }
        }

        Map<TreeNode, Boolean> visited = new HashMap<>();
        queue.offer(target);
        visited.put(target, true);

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            if (level == k) {
                break;
            }

            level++;

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                if (current.left != null && !visited.containsKey(current.left)) {
                    queue.offer(current.left);
                    visited.put(current.left, true);
                }

                if (current.right != null && !visited.containsKey(current.right)) {
                    queue.offer(current.right);
                    visited.put(current.right, true);
                }

                if (parent.containsKey(current)
                        && !visited.containsKey(parent.get(current))) {
                    TreeNode p = parent.get(current);
                    queue.offer(p);
                    visited.put(p, true);
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }

        return result;
    }
}
