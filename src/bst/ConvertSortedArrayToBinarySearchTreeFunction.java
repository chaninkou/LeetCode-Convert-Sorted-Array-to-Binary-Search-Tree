package bst;

public class ConvertSortedArrayToBinarySearchTreeFunction {
	public TreeNode sortedArrayToBST(int[] nums) {
		// Error checking, since we don't want a -1 length for the right
		if(nums == null || nums.length == 0){
			return null;
		}
		
		// Start the BST
		return helperBSTRecursive(nums, 0, nums.length - 1);
	}

	// Helper function that does the tree
	public TreeNode helperBSTRecursive(int[] nums, int left, int right) {
		// Left pointer can not be bigger than right pointer
		// This will occur when we are already on the most left element or most right element of current range
		if(left > right){
			return null;
		}
		
		// Start from the mid point cause the array is sorted
		// Binary Search Tree always have the middle value on top to make it balance
		// We could just use (left + right)/2 cause left could never be negative since the if statement above
		int mid = left + (right - left)/2;
		
		// Use the mid point as first treeNode
		TreeNode currentNode = new TreeNode(nums[mid]);
		
		// Since currentNode will be the mid point, whatever to the left is smaller and whatever to the right is bigger than itself
		// Keep getting the left node of current node until it return null
		currentNode.left = helperBSTRecursive(nums, left, mid - 1);
		
		// Keep getting the right node of current node until it return null
		currentNode.right = helperBSTRecursive(nums, mid + 1, right);
		
		// Return the mid node that connect to every other nodes;
		return currentNode;
	}
}
