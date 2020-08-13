package Searching;

public class countOfAnElement {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 3, 3, 3 };
		int left = leftMostElement(arr, 0, arr.length - 1, 3);
		int right = rightMostElement(arr, 0, arr.length - 1, 3);
		if (left == -1 && right == -1) {
			System.out.println("No element found");
		} else {
			System.out.println(right - left + 1);
		}
	}

	public static int leftMostElement(int arr[], int l, int h, int key) {
		if (l > h) {
			return -1;
		}
		int mid = l + (h - l) / 2;
		if (arr[mid] == key) {
			if (mid != 0 && arr[mid - 1] == key) {
				return leftMostElement(arr, l, mid - 1, key);
			} else {
				return mid;
			}
		}
		if (arr[mid] > key) {
			return leftMostElement(arr, l, mid - 1, key);
		} else {
			return leftMostElement(arr, mid + 1, h, key);
		}
	}

	public static int rightMostElement(int arr[], int l, int h, int key) {
		if (l > h) {
			return -1;
		}
		int mid = l + (h - l) / 2;
		if (arr[mid] == key) {
			if (mid != arr.length - 1 && arr[mid + 1] == key) {
				return rightMostElement(arr, mid + 1, h, key);
			} else {
				return mid;
			}
		}
		if (arr[mid] > key) {
			return rightMostElement(arr, l, mid - 1, key);
		} else {
			return rightMostElement(arr, mid + 1, h, key);
		}
	}

}
