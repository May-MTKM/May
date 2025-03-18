package javacore;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"Mg Mg", "Su Su"};
		
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add('c');
		lst.add(true);
		lst.add(2.3);
		lst.add("Java");
		
		System.out.println(lst);
		
		lst.add(new Employee());
		
		System.out.println(lst);
		System.out.println(lst.get(1));
		//char ch= lst.get(1);
		
		double number = (double) lst.get(3);
		
		System.out.println(number);
		
		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		//languages.add(1);
		String value = languages.get(0);
		
		System.out.println(value);
	}

}
