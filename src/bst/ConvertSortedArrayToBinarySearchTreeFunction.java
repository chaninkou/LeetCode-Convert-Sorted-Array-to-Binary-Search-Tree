package bst;

public class ConvertSortedArrayToBinarySearchTreeFunction {
	public TreeNode sortedArrayToBST(int[] nums) {
		// If the array is empty, just return null as a tree
		if (nums.length == 0) {
			return null;
		}

		// This is the recursion function, give array, 0 as start and the last
		// element
		TreeNode head = helperFunction(nums, 0, nums.length - 1);

		return head;
	}

	// Helper function that does the tree
	public TreeNode helperFunction(int[] num, int low, int high) {
		// If low ever bigger than high, return null as means there is no node
		if (low > high) {
			return null;
		}

		// Mid point is just diving it by half everytime
		int mid = (low + high) / 2;

		// Creating a node object that have the size of num[mid]
		TreeNode node = new TreeNode(num[mid]);

		node.left = helperFunction(num, low, mid - 1);

		node.right = helperFunction(num, mid + 1, high);

		return node;
	}
}
