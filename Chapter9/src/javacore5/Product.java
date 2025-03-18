package javacore5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {
	
	private String pdCode;
	private String pdName;
	private double pdPrice;

	 public Product(String pdCode, String pdName, double pdPrice) {
	        this.pdCode = pdCode;
	        this.pdName = pdName;
	        this.pdPrice = pdPrice;
	        
	        
	       
	}

	@Override
	public String toString() {
		return "[pdCode=" + pdCode + ", pdName=" + pdName + ", pdPrice=" + pdPrice + "]";
	}

	
}