package Trees;

public class Driver {

	public static void main(String[] args) {
		
				CustTreeNode<Integer> node1 = new CustTreeNode<Integer>(null, 1,null);
				CustTreeNode<Integer> node2 = new CustTreeNode<Integer>(null, 5, null);
				CustTreeNode<Integer> node3 = new CustTreeNode<Integer>(null, 8, null);
				CustTreeNode<Integer> node4 = new CustTreeNode<Integer>(null, 10, null);

				CustTreeNode<Integer> node5 = new CustTreeNode<Integer>(node1, 3, node2);
				CustTreeNode<Integer> node6 = new CustTreeNode<Integer>(node3, 9, node4);
				
				CustTreeNode<Integer> root = new CustTreeNode<Integer>(node5, 6, node6);
				
				
				CustBinaryTree<Integer> myTree = new CustIntegerBinaryTreeImpl(root);
				System.out.println(myTree.isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
				System.out.println(myTree);
				
	}

}
