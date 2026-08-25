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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Double>> list = new ArrayList<>();
        parse(root,0,list);
        List<Double> avg = new ArrayList<>();
        averageW(list,avg);
        return avg;

    }

    public void parse(TreeNode root,int level, List<List<Double>> list){
        if(root == null){
            return;
        }
        if(list.size() == level){
            list.add(new ArrayList<>());
        }
        list.get(level).add((double) root.val);
        parse(root.left,level+1,list);
        parse(root.right,level+1,list);
    }

    public void averageW(List<List<Double>> list, List<Double> avg){
        int levels = list.size();
        for(int i = 0;i<levels;i++){
            double sum = 0;
            double ctr = 0;
            for(int j = 0;j<list.get(i).size();j++){
                sum += list.get(i).get(j);
                ctr++;
            }
            avg.add(sum/ctr);
        }
    }
}