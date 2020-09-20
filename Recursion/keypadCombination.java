package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class keypadCombination {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> ans = keypad(str);
		System.out.println(ans);
		scn.close();
	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static ArrayList<String> keypad(String str) {
		ArrayList<String> lst = new ArrayList<>();
		keypad(str, "", lst);
		return lst;
	}

	public static void keypad(String str, String res, ArrayList<String> lst) {
		if (str.length() == 0) {
			lst.add(res);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		String code = getCode(ch);

		for (int i = 0; i < code.length(); i++) {
			keypad(ros, res + code.charAt(i), lst);
		}
	}

}
