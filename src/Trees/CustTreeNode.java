package Trees;

public class CustTreeNode<T extends Object> {

	T data;
	CustTreeNode leftNode;
	CustTreeNode rightNode;
	
	
	public boolean hasLeft() {
		return leftNode != null;
	}
	public boolean hasRight() {
		return rightNode != null;
	}
	
	public boolean hasChildren() {
		return this.hasLeft() || this.hasRight();
	}
	
	public CustTreeNode(CustTreeNode<T> left, T data , CustTreeNode<T> right) {
		this.leftNode =left;
		this.data=data;
		this.rightNode=right;
	}
	

}
