package Trees;

import java.lang.module.ModuleDescriptor.Builder;

public class CustIntegerBinaryTreeImpl implements CustBinaryTree<Integer> {
	
	CustTreeNode<Integer> root;
	StringBuilder builder = new StringBuilder();
	
	
	public CustIntegerBinaryTreeImpl(CustTreeNode<Integer> root) {
		// TODO Auto-generated constructor stub
		this.root=root;
	}

	@Override
	public boolean addNode(CustTreeNode<Integer> newNode) {
		CustTreeNode<Integer> node = root;
		boolean nodeAdded=false;
		while(true) {
			if(node.data < newNode.data) {
				if(node.hasLeft())
					node=node.leftNode;
				else {
					node.leftNode=newNode;
					nodeAdded=true;
					break;
				}
			}else
			{
				if(node.hasRight())
					node=node.rightNode;
				else {
					node.rightNode=newNode;
					nodeAdded=true;
					break;
				}
			}
		}
		return nodeAdded;
	}

	@Override
	public String toString() {
		 printTree(root);
		 return builder.toString();
	}
	
	
	public void  printTree(CustTreeNode<Integer> node)
	{
//		System.out.println("Inside print Tree");
		
		if(node != null) {
			
			printTree(node.leftNode);
			builder.append(node.data+"|");
			printTree(node.rightNode);
		}
//		else
//			builder.append("leaf|");
		
		
	}
	
	public boolean isValidBST(CustTreeNode<Integer> node, Integer min, Integer max) {
		
		if(node==null)
			return true;
		System.out.println(node.data + " " + min + " " + max);
		if(node.data < min || node.data  > max )
			return false;
		
		return isValidBST(node.leftNode,min, node.data  ) && isValidBST(node.rightNode,node.data ,max) ;
		
	}
}
