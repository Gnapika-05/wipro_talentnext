package java_fundamentals;

public class Arrays_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {15,9,3,12};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		

	}

}
