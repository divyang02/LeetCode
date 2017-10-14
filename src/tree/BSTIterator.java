package tree;

import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    private Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null) {
            stack.push(curr);
            if(curr.left != null) curr = curr.left;
            else break;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        
        TreeNode node = stack.pop();
        TreeNode curr = node;
        if(curr.right != null) {
        	curr = curr.right;
        	while(curr != null) {
                stack.push(curr);
                if(curr.left != null) curr = curr.left;
                else break;
            }
        } 
        
        return node.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */