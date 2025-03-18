package javacore;
import java.util.Scanner;
public class ProfitLost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner (System.in);
		
		System.out.println("The Cost Price: ");
		double CostPrice = a.nextDouble();
		
		System.out.println("The Selling Price: ");
		double SellingPrice = a.nextDouble();
		
		if (CostPrice > SellingPrice) {
			double Lost = CostPrice - SellingPrice;
			System.out.println("Your lost: " + Lost);
		}
		else if (CostPrice < SellingPrice) {
			double Profit = SellingPrice - CostPrice;
			System.out.println("Your Profit: " + Profit);
		}

	}

}
