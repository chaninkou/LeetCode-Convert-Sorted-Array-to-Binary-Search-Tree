package bst;

import java.util.Arrays;

public class Main {
	public static void main (String[] args){
		int[] nums = {-10,-3,0,5,9};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		ConvertSortedArrayToBinarySearchTreeFunction solution = new ConvertSortedArrayToBinarySearchTreeFunction();
		
		TreeNode tree = solution.sortedArrayToBST(nums);
		
		System.out.println("Solution: " + "[" +  tree.val + tree.left.val + tree.right.val + tree.left.left.val + tree.left.right.val + tree.right.left.val + tree.right.right.val + "]");
	}
}
