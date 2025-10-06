

public class BubbleSort implements SortInterface{
	//private Integer[] sorted;
	
	

	@Override
	public void sort(Integer[] arrayToSort) {
		
		for (int i = 0; i < arrayToSort.length-1; i++) {
			for(int j =0; j < arrayToSort.length-i-1; j++) {
				if (arrayToSort[j] > arrayToSort[j+1]) {
					Integer temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j+1];
					arrayToSort[j+1] = temp;
				}
			}
		}
		
		//sorted = arrayToSort;
		
	}
	
	
	/*public Integer[] getSorted() {
		return sorted;
	}*/
	
	public static void main(String [] args) {
		
		Integer [] nums = {10, 4, 15, 17, 11, 13, 5};
		//InsertionSort mySort = new InsertionSort();
		BubbleSort mySort = new BubbleSort();
		mySort.sort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}

}



