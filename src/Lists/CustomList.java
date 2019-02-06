package Lists;

public interface CustomList {

	public CustomListNode addNode(int pData);
	public CustomListNode getHeadNode();
	public void deleteNodeAt(int pPosition);
	public void SearchNode(CustomListNode pNewNode);
	public CustomListNode getNodeFromEnd(int pPosition);
	public boolean isCyclicList();
	public CustomListNode getStartOfCycle();
	public void reverseTheList();
	
}
