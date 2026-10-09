
class Tuple {
    Node node;
    int col;

    Tuple(Node node, int col) {
        this.node = node;
        this.col = col;
    }
}

class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();

        q.offer(new Tuple(root, 0));

        while (!q.isEmpty()) {
            Tuple t = q.poll();

            Node node = t.node;
            int col = t.col;

            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(node.data);

            if (node.left != null) {
                q.offer(new Tuple(node.left, col - 1));
            }

            if (node.right != null) {
                q.offer(new Tuple(node.right, col + 1));
            }
        }

        for (ArrayList<Integer> values : map.values()) {
            ans.add(values);
        }

        return ans;
    }
}
