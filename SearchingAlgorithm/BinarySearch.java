package Searching;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int index = binarySearch(arr, 0, arr.length - 1, 1);
		System.out.println(index);
	}

	public static int binarySearch(int arr[], int l, int h, int key) {
		if(l>h) {
			return -1;
		}
		int mid = l + (h-l)/2;
		if(arr[mid] == key) {
			return mid;
		}
		if(arr[mid] > key) {
			return binarySearch(arr, l, mid-1, key);
		} else {
			return binarySearch(arr, mid+1, h, key);
		}
	}

}
