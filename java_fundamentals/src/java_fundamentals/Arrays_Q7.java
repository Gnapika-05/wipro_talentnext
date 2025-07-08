package java_fundamentals;

import java.util.Arrays;

public class Arrays_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,34,12,45,67,89};
		Arrays.sort(arr);
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				arr[i+1]=arr[j];
				i++;
			}
		}
		System.out.print("{");
		for(int k=0;k<=i;k++) {
			System.out.print(arr[k]);
			if(k<i) 
				System.out.print(",");
		}
	
		System.out.println("}");

	}

}
