
public class MyArray {
	int array[] = new int[10];

	MyArray(int array[]) {
		this.array = array;
	}

	public int getSmallestElement() {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;

	}

	public int getLargestElement() {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public int sumAllElements () {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum+= array[i];
		}
		return sum;
	}
	
	public void printAllElements () {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
