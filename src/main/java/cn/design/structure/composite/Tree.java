package cn.design.structure.composite;

public class Tree {
	private TreeNode root;

	Tree(String name) {
		root = new TreeNode(name);
	}

	public static void main(String[] args) {
		Tree tree = new Tree("world");
		TreeNode node1 = new TreeNode("America");
		TreeNode node2 = new TreeNode("China");
		TreeNode node3 = new TreeNode("Japan");
		tree.root.add(node1);
		tree.root.add(node2);
		node2.add(node3);
	}
}
