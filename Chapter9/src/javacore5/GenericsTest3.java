package javacore5;
import java.util.List;
import java.util.ArrayList;


public class GenericsTest3 {
public static void main(String [] args) {
List<Animal> list1=new ArrayList<Animal>();
list1.add(new Animal());
list1.add(new Dog());
list1.add(new Cat());
print(list1);
display(list1);

List<Dog> list2=new ArrayList<Dog>();
list2.add(new Dog());
print(list2);
display(list2);

List<Cat> list3=new ArrayList<Cat>();
list3.add(new Cat());
print(list3);
display1(list3); 
}
public static void print(List<? extends Animal>list){
List<? extends Animal> list1=list;
for(Object o:list1)
System.out.println(o);
}
public static void display(List<? super Dog>list){
List<? super Dog> list1=list;
for(Object o:list1)
System.out.println(o);
}
public static void display1(List<? super Cat>list){
List<? super Cat> list1=list;
for(Object o:list1)
System.out.println(o);
}

}
