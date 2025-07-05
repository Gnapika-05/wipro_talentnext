package java_fundamentals;

public class FlowControl_Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		int sum=0;
		while(number>0) {
			int lastDigit=number%10;
			sum=sum+lastDigit;
			number=number/10;
		}
		System.out.println(sum);

	}

}
