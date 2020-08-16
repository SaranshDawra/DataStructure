package Sorting;

public class mergeSort {

	public static void main(String[] args) {

		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		mergesort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void mergesort(int arr[], int l, int h) {
		if (l < h) {
			int mid = l + (h - l) / 2;
			mergesort(arr, l, mid);
			mergesort(arr, mid + 1, h);
			mergeHalves(arr, l, mid, h);
		}
	}

	public static void mergeHalves(int arr[], int l, int mid, int h) {
		int[] helper = new int[h + 1];
		for (int i = l; i <= h; i++) {
			helper[i] = arr[i];
		}

		int helperLeft = l, current = l, helperRight = mid + 1;

		while (helperLeft <= mid && helperRight <= h) {
			if (helper[helperLeft] <= helper[helperRight]) {
				arr[current] = helper[helperLeft];
				current++;
				helperLeft++;
			} else {
				arr[current] = helper[helperRight];
				current++;
				helperRight++;
			}
		}

		int rem = mid - helperLeft;
		for (int i = 0; i <= rem; i++) {
			arr[current + i] = helper[helperLeft + i];
		}
	}

}
