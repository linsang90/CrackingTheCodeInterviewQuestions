
/* Q 4.3 (pg86) 
 * Author: Sang Lin
 * Date: 08/28/2015
 */
public class BuildBST {

	public static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int v) {
			value = v;
			left = null;
			right = null;
		}
	}
	
	public TreeNode buildBBST(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}
	
	private TreeNode helper(int[] nums, int low, int high) {
		if(low > high) return null;
		int mid = (low + high) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = helper(nums, low, mid - 1);
		root.right = helper(nums, mid + 1, high);
		return root;
	}
}
