package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class codeOfString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> ans = cos(str);
		System.out.println(ans);
		scn.close();
	}

	public static ArrayList<String> cos(String str) {
		ArrayList<String> lst = new ArrayList<>();
		cos(str, "", lst);
		return lst;
	}

	public static void cos(String str, String ans, ArrayList<String> lst) {
		if(str.length() == 0) {
			lst.add(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			String ch = str.substring(0, i + 1);
			String ros = str.substring(i + 1);
			if(ch.length() <= 2 && Integer.parseInt(ch) <= 26) {
				char c = (char)(Integer.parseInt(ch) + 96);
				cos(ros, ans + c , lst);
			}
		}
	}

}
