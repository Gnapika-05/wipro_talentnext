package oops_inheritance;

import java.util.StringJoiner;

public class StringJoinerClass_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1=new StringJoiner("-");
		s1.add("Hyderabad");
		s1.add("Banglore");
		s1.add("Mumbai");
		StringJoiner s2=new StringJoiner("-");
		s2.add("Chennai");
		s2.add("Pune");
		s2.add("Delhi");
		//case 1 s1 merged to s2
		StringJoiner merge1=new StringJoiner("-");
		merge1.merge(s2);
		merge1.merge(s1);
		System.out.println(merge1);
		//case 2 s2 merged to s1
		StringJoiner merge2=new StringJoiner("-");
		merge2.merge(s1);
		merge2.merge(s2);
		System.out.println(merge2);
		

	}

}
