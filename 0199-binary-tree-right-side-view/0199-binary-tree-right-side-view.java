class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        rightView(root, 0, result);

        return result;
    }

    public void rightView(TreeNode root, int level, List<Integer> result) {
        if (root == null) {
            return;
        }

        // First node we visit at this level is the rightmost node
        if (result.size() == level) {
            result.add(root.val);
        }

        // Visit right first
        rightView(root.right, level + 1, result);

        // Then visit left
        rightView(root.left, level + 1, result);
    }
}