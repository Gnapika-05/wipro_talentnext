package java_fundamentals;

public class Arrays_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,34,56,7};
		int target=Integer.parseInt(args[0]);
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println(i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("-1");
		}
		
		
 
	}

}
