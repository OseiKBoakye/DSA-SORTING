

public class InsertionSort implements SortInterface{
	Integer[] insertion;

	@Override
	public void sort(Integer[] arrayToSort) {
		for (int i=1; i< arrayToSort.length; i++) {
			int j = i;
			
			while(j > 0 && arrayToSort[j] < arrayToSort[j-1]) {
				Integer temp = arrayToSort[j];
				arrayToSort[j] = arrayToSort[j-1];
				arrayToSort[j-1] = temp;
				j--;
			}
			
		}
		insertion = arrayToSort;
	}
	
	public Integer[] getSort() {
		return insertion;
	}

}
