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
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        int level = 0;
        calcBottom(root,level,list);
        return list.get(list.size()-1).get(0);
    }

    public void calcBottom(TreeNode root, int level , List<List<Integer>> list){
        if(root == null){
            return;
        }

        if(list.size() == level){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        calcBottom(root.left,level+1,list);
        calcBottom(root.right,level+1,list);
    }
}