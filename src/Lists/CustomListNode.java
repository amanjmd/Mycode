package Lists;

public class CustomListNode {

	public int data;
	public CustomListNode nextNode;
	public CustomListNode(int data) {

		this.data=data;
	}
	
	@Override
	public String toString() {
		
		return this.data+"";
	}
	
}
