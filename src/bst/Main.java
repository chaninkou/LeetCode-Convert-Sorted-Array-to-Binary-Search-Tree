package bst;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main (String[] args){
		int[] nums = {-10,-3,0,5,9,10};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		ConvertSortedArrayToBinarySearchTreeFunction solution = new ConvertSortedArrayToBinarySearchTreeFunction();
		
		TreeNode tree = solution.sortedArrayToBST(nums);
		
		String solutionTree = treeNodeToString(tree);
		
		System.out.println("Solution: " + solutionTree);
	}
	
	// How to print a print level by level
	public static String treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }
    
        String output = "";
        
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        
        nodeQueue.add(root);
        
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
    
            if (node == null) {
              output += "null, ";
              continue;
            }
    
            output += String.valueOf(node.val) + ", ";
            
            nodeQueue.add(node.left);
            
            nodeQueue.add(node.right);
        }
        
        return "[" + output.substring(0, output.length() - 2) + "]";
    }
	
}
