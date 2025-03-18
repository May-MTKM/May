package javacore;
import java.util.HashSet;
import java.util.ArrayList;

public class HashSetTest {

	public static void main(String args[]){
		HashSet set=new HashSet();
		
		set.add("John");
		set.add("Marry");
		set.add("David");
		set.add("Smith");
		set.add("Smith");

		System.out.println(set);
	}
}
