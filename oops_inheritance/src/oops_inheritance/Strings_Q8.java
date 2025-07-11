package oops_inheritance;

import java.util.Scanner;

public class Strings_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String result="";
		int n=s.length();
		for(int i=0;i<n;i++) {
			if((i>0&&s.charAt(i-1)=='*')||s.charAt(i)=='*'||(i<n-1&&s.charAt(i+1)=='*' )){
				continue;
			}
			result+=s.charAt(i);
		}
		System.out.println(result);

	}

}
