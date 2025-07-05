package java_fundamentals;

public class FlowControl_Q_1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		if(num1%10 == num2%10){
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
