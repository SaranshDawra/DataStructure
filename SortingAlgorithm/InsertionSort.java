import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		insertionSort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int j = i-1;
			int key = arr[i];
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

	public static void insertionSortRecursive(int arr[], int n) {
		if (n <= 1) {
			return;
		}

		insertionSortRecursive(arr, n - 1);

		int last = arr[n - 1];
		int j = n - 2;

		while (j >= 0 && arr[j] > last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;
	}

}