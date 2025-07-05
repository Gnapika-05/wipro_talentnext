package java_fundamentals;

public class FlowControl_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		String reversedNo="";
		while(number>0) {
			int lastDigit=number%10;
			reversedNo+=Integer.toString(lastDigit);
			number=number/10;
		}
		System.out.println(reversedNo);

	}

}
