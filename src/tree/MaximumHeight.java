package tree;

public class MaximumHeight {
	public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int hl = maxDepth(root.left);
        int hr = maxDepth(root.right);
        int depth = Math.max(hl,hr) + 1;
        return depth;
    }
}
