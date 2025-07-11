package oops_inheritance;

import java.util.Scanner;

public class Strings_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		if(a.length()<b.length()) {
			System.out.print(a+b+a);
		}
		else {
			System.out.print(b+a+b);
		}
		

	}

}
