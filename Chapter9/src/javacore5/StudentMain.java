package javacore5;
import java.util.ArrayList;
import java.util.LinkedList;

public class StudentMain {
	
	public static void main (String[] args) {
		
		ArrayList<Student> studentData = new ArrayList<>();
		studentData.add(new Student("S-16325", "May Thae Khaing Myint", 18));
		studentData.add(new Student("S-15049", "Mary James", 24));
		studentData.add(new Student("S-16052", "Khun Sint", 18));
		studentData.add(new Student("S-15893", "Khant", 18));
		studentData.add(new Student("S-16894", "Saw Yan Naung", 25));
		
		System.out.println("Students under 20: ");
		for (Student stu : studentData) {
			if (stu.getAge() < 20) {
                System.out.println(stu);
            }
        }
		
		LinkedList<Student> studentInfo = new LinkedList<>();
		studentInfo.add(new Student("P 23158", "May", 18));
		studentInfo.add(new Student("P 25300", "Maria", 19));
		studentInfo.add(new Student("P 24896", "Micheal", 23));
		studentInfo.add(new Student("P 23500", "Mary", 18));
		studentInfo.add(new Student("P 24800", "Molly", 25));
		
		System.out.println("Students over 20: ");
		for (Student student : studentInfo) {
			if (student.getAge() > 20) {
                System.out.println(student);
            }
        }
		
		}
		
		
	}


