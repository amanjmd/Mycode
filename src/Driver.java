
public class Driver {

	public static void main(String[] args) {
		
		int[] inputList = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		CustomList myList = CustomListImpl.IntegerArrayAsCyclicList(inputList);
//		System.out.println(myList);
//		System.out.println(myList.getNodeFromEnd(1));
		System.out.println(myList.isCyclicList());
		System.out.println(myList.getStartOfCycle());
	}
	
}
