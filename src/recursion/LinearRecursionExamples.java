package recursion;

public class LinearRecursionExamples {
	/**
	 * Simple recursion example to compute factorial of n
	 * runs in O(n) time
	 * @param n is a positive integer
	 * @return returns product of all natural numbers until n
	 */
	public static int factorial(int n) throws IllegalArgumentException{
		if(n<0) {
			throw new IllegalArgumentException("n must be positive");
		}
		if(n==0) {
			return 1;
		}
		return n* factorial(n-1);
	}
	/**
	 * Binary search method searches a array for a given element
	 * runs in O(logn) time
	 * @param data : an array of sorted numbers (ascending)
	 * @param target: The target variable that needs to be checked
	 * @param low: lowest number in array
	 * @param high: highest number in array
	 * @return boolean value indicating x is in data or not
	 */
	public static boolean BinarySearch(int[] data,int target, int low, int high) {
		int mid = (high+low)/2;
		if(low>high) {
			return false;
		}
		
		else if(mid<target) {
			return BinarySearch(data, target, mid+1,high);
		}
		else if(mid>target) {
			return BinarySearch(data,target, low,mid-1);
			}
		return true;
	}
	/**
	 * Linear Sum computes the sum of first n numbers in a given array a using recursion
	 * @param n is the size of the array
	 * @return returns the sum of n numbers
	 */
	public static int LinearSum(int[] A,int n) {
		if(n==0) {
			return 0;
		}
		return LinearSum(A, n - 1) + A[n-1];
	}
	/**
	 * Reverses an array within the given indices
	 * @param A is the array within which i and j exist 
	 * @param i is the lower index from which the array needs to be reversed
	 * @param j is the upper index
	 * <pre>i is less than or equal to j</pre>
	 */
	public static void ReverseArray(int[] A, int i, int j) throws IllegalArgumentException {
		if(i>j) {
			throw new IllegalArgumentException();
		}
		if(i<j) {
			A[i] = A[j];
			ReverseArray(A, i +1, j-1);
		}
		return;
		
	}
	
}
