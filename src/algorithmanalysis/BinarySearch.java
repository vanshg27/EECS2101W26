package algorithmanalysis;
/**
 * This algorithm is used to find an integer in a given set of sorted number(Ascending)
 * This algorithm runs in  O(log n) running time
 */
public class BinarySearch {
	private int[] a;
	private int x;
	private int p;
	public BinarySearch(int[] sortedarr, int num) {
		a = sortedarr;
		x = num;
		int low = 0;
		int high = a.length - 1;
		int mid = (low+high)/2;
		while(low<=high) {
			if(a[mid]<x) {
				low = mid+1;	//if mid is lower than x go to upper half of sub list
			}
			else if(x<a[mid]) {
				high=mid-1;		//if mid is greater than x go to lower half of sublist
			}
			else {
				p = mid;
			}
		}
	}
	public int find() {
		return p;
	}

}
