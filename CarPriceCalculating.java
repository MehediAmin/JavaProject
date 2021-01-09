import java.util.Scanner;

public class CarPriceCalculating {

	public static void main(String[] args) {
        
		int base_price, down_payment, admin_fee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter car base price = ");
		base_price = sc.nextInt();
		System.out.print("Enter down payment = ");
		down_payment = sc.nextInt();
		System.out.print("Enter Admin fee = ");
		admin_fee = sc.nextInt();
		
		double tax = (base_price+down_payment+admin_fee)*7/100;
		System.out.println("Calculated Tax for 7 years = "+tax);
		
		double interest = (base_price - down_payment)*3/100;
		System.out.println("Calculated Interest = "+interest);
		
		double total = (base_price - down_payment + admin_fee + tax + interest);
		System.out.println("Total car price = "+total);
		
		double monthly_pay = total / (12*7);
		//System.out.println("Monthly Payment = "+monthly_pay);
		System.out.printf("Monthly pay = %.2f", monthly_pay);

	}

}
