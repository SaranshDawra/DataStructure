package Searching;

public class leftMostKeyElement {

	public static void main(String[] args) {
		int arr[] = { 3, 3, 3, 3, 3 };
		int index = leftMostKey(arr, 0, arr.length - 1, 3);
		System.out.println(index);
	}

	public static int leftMostKey(int arr[], int l, int h, int key) {
		if (l > h) {
			return -1;
		}
		int mid = l + (h - l) / 2;
		if (arr[mid] == key) {
			if (mid != 0 && arr[mid - 1] == key) {
				return leftMostKey(arr, l, mid - 1, key);
			} else {
				return mid;
			}
		}
		if (arr[mid] > key) {
			return leftMostKey(arr, l, mid - 1, key);
		} else {
			return leftMostKey(arr, mid + 1, h, key);
		}
	}

}
