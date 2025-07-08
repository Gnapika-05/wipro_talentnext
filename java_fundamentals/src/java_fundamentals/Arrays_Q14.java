package java_fundamentals;

public class Arrays_Q14 {

	public static void main(String[] args) {
	                if (args.length != 9) {
	                	System.out.println("Please enter exactly 9 integers as command-line arguments.");
		            return;
		        }

		        int max = Integer.MIN_VALUE; 
		        System.out.println("The given array is:");
		   
		        for (int i = 0; i < 9; i++) {
		            int num = Integer.parseInt(args[i]);
		            System.out.print(num + " ");
		            
		            if (num > max) {
		                max = num;
		            }
		            if ((i + 1) % 3 == 0) {
		                System.out.println();
		            }
		        }

		        System.out.println("The biggest number in the given array is " + max);
		    }
}
