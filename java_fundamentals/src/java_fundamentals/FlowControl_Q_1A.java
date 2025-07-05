package java_fundamentals;

public class FlowControl_Q_1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer=Integer.parseInt(args[0]);
		if(integer>0) {
			System.out.println("Positive");
		}else if(integer<0){
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}

	}

}
