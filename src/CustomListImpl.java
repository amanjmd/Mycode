
public class CustomListImpl implements CustomList {

	CustomListNode headNode, TailNode;
	
	public CustomListNode addNode(int pData){
		CustomListNode newNode = new CustomListNode(pData);
		if(this.getHeadNode() == null) {
		this.setHeadNode(newNode);
		this.setTailNode(newNode);
		this.getTailNode().nextNode=null;
		return newNode;
		}else {
			this.getTailNode().nextNode=newNode;
			this.setTailNode(newNode);
			this.getTailNode().nextNode=null;
			return newNode;
		}	
	}
	
	public void deleteNodeAt(int pPosition){
		int i = 0;
		CustomListNode node = this.getHeadNode();
		while(i < pPosition-1 ) {
			node =  node.nextNode;
			i++;
		}
		if(node == this.getHeadNode())
		{
			this.setHeadNode(node.nextNode);
			return;
		}
		else if(node.nextNode==this.getTailNode())
		{
			node.nextNode=null;	
		}
		node.nextNode = node.nextNode.nextNode;
	}
	
	public void SearchNode(CustomListNode pNewNode){
		
	}
	
	public static CustomList IntegerArrayAsCyclicList(int [] pInputArray) {
		CustomListImpl myList = new CustomListImpl();
		CustomListNode cycleEntry=null;;
		for(int i=0;i<pInputArray.length;i++) {
			CustomListNode addedNode = myList.addNode(pInputArray[i]);
			
			if (i==4) {
				cycleEntry=addedNode;
			}
			
		}
		myList.getTailNode().nextNode=cycleEntry;
		return myList;
		
	}
	public static CustomList IntegerArrayAsList(int [] pInputArray) {
		CustomListImpl myList = new CustomListImpl();
		for(int i=0;i<pInputArray.length;i++) {
			myList.addNode(pInputArray[i]);
		}
		
		return myList;
		
	}	
	@Override
	public CustomListNode getHeadNode() {
		return headNode;
	}

	
	public void setHeadNode(CustomListNode headNode) {
		this.headNode = headNode;
	}

	public CustomListNode getTailNode() {
		return TailNode;
	}

	public void setTailNode(CustomListNode tailNode) {
		TailNode = tailNode;
	}

	@Override
	public String toString() {
		StringBuilder listString =new StringBuilder("");
		CustomListNode startNode = this.getHeadNode();
		listString.append(startNode.data);
		while(startNode.nextNode != null) {
			startNode=startNode.nextNode;
			listString.append(" -> " + startNode.data);
		}
		
		return listString.toString();
	}

	@Override
	public CustomListNode getNodeFromEnd(int pPosition) {
		CustomListNode aheadPointer, mainPointer ;
		int i = 0;
		
		aheadPointer = this.getHeadNode();
		while(i<pPosition && aheadPointer!=null) {
			aheadPointer = aheadPointer.nextNode;
			i++;
		}
		if(aheadPointer ==null)
		{
			if(i==pPosition)
				return this.headNode;
			return null;
		}
		else{
			mainPointer=this.getHeadNode();
		}
//		System.out.println(aheadPointer.data);
		while(aheadPointer !=null)
		{
			aheadPointer=aheadPointer.nextNode;
			mainPointer =mainPointer.nextNode;
		}
//		System.out.println(mainPointer.data);
		
		return mainPointer;
	}
	
	public boolean isCyclicList(){
		CustomListNode fastPtr,slowPtr;
		fastPtr=slowPtr=this.getHeadNode();
		fastPtr=fastPtr.nextNode.nextNode;
		slowPtr=slowPtr.nextNode;
		while((fastPtr!=null) && (slowPtr != null)) {
			
			System.out.println("==================================");
			System.out.println("fast " + fastPtr);
			System.out.println("slow " + slowPtr);
			System.out.println("==================================");
			if(fastPtr==slowPtr)
			{
				
				return true;
			}
			fastPtr=fastPtr.nextNode.nextNode;
			slowPtr=slowPtr.nextNode;
		}
		return false;
	}
	public CustomListNode getStartOfCycle(){
		CustomListNode fastPtr,slowPtr;
		fastPtr=slowPtr=this.getHeadNode();
		fastPtr=fastPtr.nextNode.nextNode;
		slowPtr=slowPtr.nextNode;
		while((fastPtr!=null) && (slowPtr != null)) {
			if(fastPtr==slowPtr)
			{
				
				return locateCycleStart(slowPtr,fastPtr);
			}
			fastPtr=fastPtr.nextNode.nextNode;
			slowPtr=slowPtr.nextNode;
		}
		
		return null;
	}

	private CustomListNode locateCycleStart(CustomListNode slowPtr, CustomListNode fastPtr) {
		slowPtr = this.getHeadNode();
		while(slowPtr.nextNode != fastPtr.nextNode)
		{
			slowPtr=slowPtr.nextNode;
			fastPtr=fastPtr.nextNode;
			
		}
		return slowPtr;
		
	}
	
	
}
