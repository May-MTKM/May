package javacore;

public class StaticKeyword {

	public static void methodA() {
		System.out.println("I am methodA");
		}
		public void methodB() {
		System.out.println("I am methodB");
		}
		static {
		System.out.println("I am static block");
		}
		public static void main(String [] agrs) {
		methodA();
		StaticKeyword sk=new StaticKeyword();
		sk.methodB();
		}

		}