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
    List<Integer> ans=new ArrayList<>();
    public void levelNode(TreeNode root,int level){
        if(root==null) return;
        if(ans.size()==level) ans.add(root.val);
        levelNode(root.right,level+1);
        levelNode(root.left,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        levelNode(root,0);
        return ans;
    }
}
