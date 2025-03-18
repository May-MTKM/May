package javacore;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] ary= {"A","B","C"};
		int Count = 1;
		for(String s:ary) {
		
			if (Count == 3) {
		System.out.println(Count + ". " + s);
		break;
		
			}
			Count++;
		}
			
	}

}
