package tree;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        int count1 = sizeOf(p);
        int count2 = sizeOf(q);
        if(count1 != count2) return false;
        else {
            return checkVal(p,q);
        }
    }
    
    private int sizeOf(TreeNode root) {
        if(root == null) return 0;
        int count = 0;
        count += sizeOf(root.left) + 1;
        count += sizeOf(root.right) + 1;
        return count;
    }
    
    private boolean checkVal(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 != null && root2 == null) return false;
        if(root1 == null && root2 != null) return false;
        if(root1.val != root2.val) return false;
        else if (checkVal(root1.left, root2.left) && checkVal(root1.right, root2.right)) {
            return true;
        }
        else {
            return false;
        }
    }
}
