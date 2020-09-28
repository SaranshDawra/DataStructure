package Recursion;

import java.util.Scanner;

public class allSubset {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		String str = "";
		for (int i = 0; i < n; i++) {
			str += arr[i];
		}
		int key = scn.nextInt();
		subset(str, key, "");
		scn.close();
	}

	public static void subset(String str, int key, String ans) {

		if (str.length() == 0) {
			if (ans != "") {
				int n = Integer.parseInt(ans);
				int s = 0;
				while (n != 0) {
					int r = n % 10;
					s += r;
					n = n / 10;
				}
				if (s == key) {
					for (int i = 0; i < ans.length(); i++) {
						char ch1 = ans.charAt(i);
						System.out.print(ch1 + " ");
					}
					System.out.print(" ");
				}
			}
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		subset(ros, key, ans + ch);
		subset(ros, key, ans);
	}

}
