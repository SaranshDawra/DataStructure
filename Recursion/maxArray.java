package Recursion;

public class maxArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 100, 50, 60, 70, 80, 90 };
		System.out.println(maxArrayRec(arr, 0));
	}

	public static int maxArrayRec(int arr[], int vidx) {
		if(vidx == arr.length) {
			return Integer.MIN_VALUE;
		}
		
		int max = maxArrayRec(arr, vidx + 1);
		if(arr[vidx] > max) {
			max = arr[vidx];
		}
		
		return max;
	}

}
