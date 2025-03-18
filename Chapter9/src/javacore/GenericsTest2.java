package javacore;

public class GenericsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyGen <Integer> m1=new MyGen<>();
		m1.add(3);
		System.out.println(m1.get());
		MyGen<String> m2=new MyGen<String>();
		m2.add("Hello");
		System.out.println(m2.get());

	}

}
