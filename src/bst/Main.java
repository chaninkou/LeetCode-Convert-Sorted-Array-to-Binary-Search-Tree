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
        
        // add root as default
        nodeQueue.add(root);
        
        // While queue not empty
        while(!nodeQueue.isEmpty()) {
        	// Get the element that the queue removed
            TreeNode node = nodeQueue.remove();
    
            // If its node, then add null to the output string
            if (node == null) {
              output += "null, ";
              continue;
            }
    
            // Add the node to the output string
            output += String.valueOf(node.val) + ", ";
            
            // Add the left node to the queue
            nodeQueue.add(node.left);
            
            // Add the right node to the queue
            nodeQueue.add(node.right);
        }
        
        return "[" + output.substring(0, output.length() - 2) + "]";
    }
	
}
