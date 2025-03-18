package javacore5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		
		 Map<String, Product> productData = new HashMap<>();
		
		Product product1 = new Product("P001", "Laptop", 1200.00);
		Product product2 = new Product("P002", "Lipstick", 70.00);
        Product product3 = new Product("P003", "Frying Pan", 800.75);
        Product product4 = new Product("P004", "Highlight Pens", 45.25);
        Product product5 = new Product("P005", "Book Shelf", 500.00);
		
        productData.put(product1.getPdCode(), product1);
        productData.put(product2.getPdCode(), product2);
        productData.put(product3.getPdCode(), product3);
        productData.put(product4.getPdCode(), product4);
        productData.put(product5.getPdCode(), product5);
		
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a code from P001 to P005: ");
        String input = a.nextLine().toUpperCase();
        
        Product foundProduct = productData.get(input);
        
        if (foundProduct == null) {
        	System.out.println("Data not found.");
        }
        else {
        	System.out.println("Product Found: " + foundProduct);
        }
        a.close();
	}
	

}
