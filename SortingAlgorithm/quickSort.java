package Sorting;

public class quickSort {

	public static void main(String[] args) {
		int arr[] = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
		quicksort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void quicksort(int arr[]) {
		quicksort(arr, 0, arr.length - 1);
	}

	public static void quicksort(int arr[], int l, int h) {
		if (l < h) {
			int index = partition(arr, l, h);
			quicksort(arr, l, index - 1);
			quicksort(arr, index + 1, h);
		}
	}

	public static int partition(int arr[], int l, int h) {
		int pivot = arr[l];
		int i = l + 1, j = h;

		while (i <= j) {
			while (i <= h && arr[i] <= pivot) {
				i++;
			}

			while (j >= l && arr[j] > pivot) {
				j--;
			}

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		int temp = arr[l];
		arr[l] = arr[j];
		arr[j] = temp;
		return j;
	}

}
