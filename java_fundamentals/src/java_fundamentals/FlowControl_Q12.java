package java_fundamentals;

public class FlowControl_Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) 
			System.out.println("Prime");
		else
			System.out.println("Not");

	}

}
