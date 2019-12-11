
public class MyArrayTest {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5 , 6, 7, 8, 9};
		MyArray array = new MyArray (arr);
		System.out.println(array.getLargestElement());
		System.out.println(array.getSmallestElement());
		System.out.println(array.sumAllElements());
		array.printAllElements();
	}

}
