package cn.design.structure.composite;

import java.util.Enumeration;
import java.util.Vector;
//整体与局部
public class TreeNode {
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();
	private String name;

	public void add(TreeNode node) {
		children.add(node);
		node.setParent(this);
	}

	public void remove(TreeNode node) {
		children.remove(node);
	}

	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	TreeNode(String name) {
		this.name = name;
	}
}
