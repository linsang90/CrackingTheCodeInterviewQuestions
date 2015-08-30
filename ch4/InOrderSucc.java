
/* Q 4.6 (pg86) 
 * Author: Sang Lin
 * Date: 08/28/2015
 */

public class InOrderSucc {
	public static class TreeNode {
		int val;
		TreeNode parent;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int v) {
			val = v;
		}
	}
	
	public TreeNode theNext(TreeNode root) {
		if(root == null) return null;
		if(root.right != null) return theLeftmost(root.right);
		else {
			TreeNode q = root;
			TreeNode x = q.parent;
			while(x != null && x.left != q) {
				q = x;
				x = x.parent;
			}
			return x;
		}
	}
	
	public TreeNode theLeftmost(TreeNode root) {
		if(root == null) return null;
		
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
}
