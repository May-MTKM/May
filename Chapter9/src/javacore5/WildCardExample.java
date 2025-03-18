package javacore5;
import java.util.List;

public class WildCardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(10,20);
		
		List<Integer> numberList = List.of(1,2,3);
		display(numberList);
		
		//display1(numberList); CAN'T CALL DISPLAY1 BECAUSE IT IS LOWER BOND
		
		List<Double> pointList = List.of(1.1,2.2,3.3);
		display(pointList);

	}
	
	public static<T extends Number >void sum (T n1, T n2) {
		double result = n1.doubleValue() + n2.doubleValue();
		System.out.println(result);
		
	}
	
	public static void display(List<? extends Number> list) {
		
		//list.add(new Integer(10)); CAN'T ADD NEW VALUE IN WILDCARD
		
		for (Object o:list) {
			System.out.println(o);
		}
		
	}

	
    public static void display2(List<? super Number> list) {
		
		//list.add(new Integer(10)); CAN'T ADD NEW VALUE IN WILDCARD
		
		for (Object o:list) {
			System.out.println(o);
		}
}

}
