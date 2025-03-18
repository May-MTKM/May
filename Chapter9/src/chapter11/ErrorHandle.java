package chapter11;

public class ErrorHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			  int a = 100/0;
			}catch(ArithmeticException ex){
			 
			  System.out.println(ex.getMessage());
			}finally{
			 
			}
	}

}
