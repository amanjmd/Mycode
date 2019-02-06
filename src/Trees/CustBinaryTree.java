package Trees;

public interface CustBinaryTree<T extends Object> {

	public boolean addNode(CustTreeNode<T> node);
	public boolean isValidBST(CustTreeNode<T> node,Integer Min, Integer Max);
}
