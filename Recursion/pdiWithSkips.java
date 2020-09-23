package Recursion;

import java.util.Scanner;

public class pdiWithSkips {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pdiSkips(n);
		scn.close();
	}
	
	public static void pdiSkips(int n) {
		if(n == 0) {
			return;
		}
		
		if(n%2 != 0) {
			System.out.print(n + " ");
		}
		
		pdiSkips(n - 1);
		
		if(n % 2 == 0) {
			System.out.print(n + " ");
		}
	}

}
