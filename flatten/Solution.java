public class Solution{
	void flatten(TreeNode root){
		if(root ==null){
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode t = root;
		while(!stack.isEmpty() || t!=null){
			if(t.right != null){
				stack.push(t.right);
				t.right = null;
			}
			if(t.left != null){
				t.right = t.left;
				t.left = null;
			}else if(!stack.isEmpty()){
				t.right = stack.pop();
			}
			t = t.right;
		}
		return;
	}
}