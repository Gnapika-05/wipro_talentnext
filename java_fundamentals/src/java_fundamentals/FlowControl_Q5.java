package java_fundamentals;

public class FlowControl_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=args[0].charAt(0);
		if(Character.isLetter(ch)) {
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(ch)) {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Character");
		}

	}

}
