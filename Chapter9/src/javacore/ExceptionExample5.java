package javacore;

public class ExceptionExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testTryCatch();
		testThrows(); 
	}
	public static void testThrows() throws RuntimeException{
		int i=25/0;

	}
	public static void testTryCatch() {
		try {
			int i=25/0;
		}catch(ArithmeticException e){
			System.out.println("Can't divide by zero");
		}}
}
