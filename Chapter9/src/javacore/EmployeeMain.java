package javacore;

public class EmployeeMain {

	public static void main (String[] args) {
		/*
		Employee emp = new Employee();
		emp.setEmpId(3);
		System.out.println(emp.getEmpId());
		System.out.println(emp);
		/*
		 /*
		  * 
		  */
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setName("Mg Mg");
		
		Employee e2 = new Employee();
		e2.setEmpId(1);
		e2.setName("Mg Mg");

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
	}
}
