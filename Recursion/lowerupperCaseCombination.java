package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class lowerupperCaseCombination {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> ans = lowerupper(str);
		System.out.println(ans);
		scn.close();

	}

	public static ArrayList<String> lowerupper(String str) {
		if (str.length() == 0) {
			ArrayList<String> lst = new ArrayList<>();
			lst.add("");
			return lst;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = lowerupper(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {
			if (!Character.isDigit(ch)) {
				mr.add(Character.toLowerCase(ch) + val);
				mr.add(Character.toUpperCase(ch) + val);
			} else {
				mr.add(ch + val);
			}
		}

		return mr;
	}

}
