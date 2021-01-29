package leetcode;

public class Main {
	public static void main(String [] args) {
		int tree [] = {1,2,2,3,4,4,3};
		
		TreeNode root = new TreeNode(tree[0], new TreeNode(2), new TreeNode(2));
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		
		root.right.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		
		leetcode101 a= new leetcode101();
		a.isSymmetric(root);
		
	}
}
