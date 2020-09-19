package Recursion;

import java.util.Scanner;

public class keypadCombinationCount {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int ans = keypadCount(str);
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

	public static int keypadCount(String str) {

		if (str.length() == 0) {
			return 1;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		int res = keypadCount(ros);

		int count = getCode(ch).length();

		return count * res;

	}

}
