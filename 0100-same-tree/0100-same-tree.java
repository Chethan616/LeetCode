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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // List<Integer> list1 = new ArrayList<>();
        // List<Integer> list2 = new ArrayList<>();
        // parse(p,list1);
        // parse(q,list2);
        // if(list1.equals(list2)){
        //     return true;
        // }
        // return false;
        if (p == null && q == null){
            return true;
        }
        if(p == null && q != null){
            return false;
        }
        if(p!= null && q == null){
            return false;
        }if(p.val != q.val){
            return false;
        }
        if(p==q){
            return true;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public void parse(TreeNode root, List<Integer> result){
        if(root == null){
            result.add(null);
            return;
        }
        result.add(root.val);
        parse(root.left,result);
        parse(root.right,result);
    }
}