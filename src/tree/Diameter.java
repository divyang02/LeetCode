package tree;

public class Diameter {
	int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        int hl = height(root.left);
        int hr = height(root.right);
        max = Math.max(max, hl+hr);
        return max;
    }
    
    private int height(TreeNode root) {
        if(root == null) return 0;
        int hl = height(root.left);
        int hr = height(root.right);
        int hei = Math.max(hl,hr) + 1;
        return hei;
    }
    }
