
/* Q 4.4 (pg86) 
 * Author: Sang Lin
 * Date: 08/28/2015
 */

import java.util.*;
import ch4.BuildBST.TreeNode;
public class CreateLLOfEachDepth {

	public List<List<TreeNode>> visitTreeInDepth(TreeNode root) {
		List<List<TreeNode>> res = new ArrayList<>();
		helper(root, res, 0);
		return res;
	}
	
	private void helper(TreeNode root, List<List<TreeNode>> res, int level) {
		if(root == null) return;
		if(res.size() < level + 1) res.add(new ArrayList<TreeNode>());
		
		res.get(level).add(root);
		helper(root.left, res, level + 1);
		helper(root.right, res, level + 1);
	}
}
