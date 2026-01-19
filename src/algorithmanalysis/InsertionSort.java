package algorithmanalysis;
/**
 * Implements Insertion sort sorting algorithm
 * Sorts unsorted arrays in O(n^2) time
 */
public class InsertionSort {
	private int[] a;
	public InsertionSort(int[] unsorted) {
		a = unsorted;
	}
	/**
	 * 
	 * @return Sorted array in ascending order
	 */
	public int[] sort() {
		int[] sorted = a;
		for(int p =1; p<a.length;p++) {
			int temp = sorted[p];
			int tempindex = 0;
			for(int j=p;j>0 && temp<sorted[j-1];j--) {
				sorted[j] = sorted[j-1];
				tempindex = j;
			}
			a[tempindex] = temp;
		}
		return sorted;
	}
}
