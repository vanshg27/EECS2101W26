package recursion;

public class LogNrecursionExamples {
	/**
	 * Implementing Binary search Recursively
	 * @param data: sorted array of integers
	 * @param low: lower index of data
	 * @param high: upper index of integers
	 * @param value: value to find
	 * @return: integer value reflecting the index of value in the array. 
	 * 			Returns -1 if value not found
	 */
	public static int recursiveBinarySearch(int[] data, int low, int high, int value) {
		int middle = (low+high)/2;
		if(data[middle] == value) {
			return middle; //value found
		}
		else if(low>=high) {
			return -1; //value not found
		}
		else if(data[middle] < value) {
			return recursiveBinarySearch(data, middle+1, high, value);
		}
		else {
			return recursiveBinarySearch(data, low, middle-1, value);
		}
	}
	/*
	 * Different version of the power(x,n) problem 
	 * @param x: long number
	 * @param n: exponent (int)
	 * @return long value reflecting x^n
	 */
	public static long exp(long x, int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return x;
		}
		else if(n%2==0) {
			return exp(x*x,n/2);
		}
		else {
			return exp(x*x,n/2) *x;
		}
	}
	/**
	 * Finds the greatest common divisor
	 * using Euclid's formula
	 * @param m
	 * @param n
	 * <pre>m is greater than or equal to n</pre>
	 * @throws IllegalArgumentException if m<n
	 */
	public long gcd(long m, long n) throws IllegalArgumentException{
		if(m<n) {
			throw new IllegalArgumentException("m should be greater than n");
		}
		while(n!=0) {
			long rem = m %n;
			m = n;
			n=rem;
		}
		return m;
	}
}
