import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		selectionSort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");;
		}
	}
	
	public static void selectionSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			int minIdx = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			if(minIdx != i) {
				int temp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = temp;
			}
		}
		
	}
	
}