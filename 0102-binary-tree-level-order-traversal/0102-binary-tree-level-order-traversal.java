class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        levelOrder(root, 0, result);

        return result;
    }

    public void levelOrder(TreeNode root, int level, List<List<Integer>> result) {
        if(root == null){
            return;
        }
        if(result.size() == level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        levelOrder(root.left, level+1,result);
        levelOrder(root.right, level+1,result);   
    }
}