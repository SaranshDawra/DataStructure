package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class boardPath {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int end = scn.nextInt();
		ArrayList<String> res = validPath(0, end);
		System.out.println(res);
		scn.close();
	}

	public static ArrayList<String> validPath(int curr, int end) {
		ArrayList<String> lst = new ArrayList<>();
		validPath(curr, end, lst, "");
		return lst;
	}

	public static void validPath(int curr, int end, ArrayList<String> lst, String ans) {
		if (curr == end) {
			lst.add(ans);
			return;
		}

		for (int i = 1; i <= 6 && curr + i <= end; i++) {
			validPath(curr + i, end, lst, ans + i);
		}
	}

}
