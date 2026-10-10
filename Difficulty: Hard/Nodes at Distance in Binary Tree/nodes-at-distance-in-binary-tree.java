
class Solution {
    public ArrayList<Integer> kDistanceNodes(Node root, int target, int k){
        HashMap<Node, Node> parent = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left != null) {
                parent.put(current.left, current);
                queue.offer(current.left);
            }

            if (current.right != null) {
                parent.put(current.right, current);
                queue.offer(current.right);
            }
        }

        Node targetNode = null;
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.data == target) {
                targetNode = current;
                break;
            }

            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }

        if (targetNode == null) {
            return new ArrayList<>();
        }

        HashSet<Node> visited = new HashSet<>();
        queue.clear();
        queue.offer(targetNode);
        visited.add(targetNode);

        int level = 0;

        while (!queue.isEmpty() && level < k) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                if (current.left != null && visited.add(current.left)) {
                    queue.offer(current.left);
                }

                if (current.right != null && visited.add(current.right)) {
                    queue.offer(current.right);
                }

                Node p = parent.get(current);
                if (p != null && visited.add(p)) {
                    queue.offer(p);
                }
            }

            level++;
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            result.add(queue.poll().data);
        }

        Collections.sort(result);

        return result;
    }
}
