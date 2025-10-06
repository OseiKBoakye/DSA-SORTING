

public class SelectionSort implements SortInterface{
	Integer[] selection;

	@Override
	public void sort(Integer[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length-1; i++) {
			int smallestElement = i;
			
			for (int j = i + 1; j < arrayToSort.length; j++) {
				if (arrayToSort[j] < arrayToSort[smallestElement]) {
					smallestElement = j;
				}
			}
			Integer temp = arrayToSort[i];
			arrayToSort[i] = arrayToSort[smallestElement];
			arrayToSort[smallestElement] = temp;
		}
		
		selection = arrayToSort;
		
	}
	
	public Integer[] getSort() {
		return  selection;
	}

}
