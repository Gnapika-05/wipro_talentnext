package oops_inheritance;

import java.util.Scanner;

public class Strings_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		if(n%2==0) {
				System.out.print(s.substring(0,n/2));
			}
		else {
			System.out.println("null");
		}

	}

}
