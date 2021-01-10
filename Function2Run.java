import java.util.Scanner;

public class Function2Run {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			
			Function2 uClass = new Function2();
			System.out.print("Enter base price = ");
			double basePrice = sc.nextDouble();
			
			System.out.print("Enter credit score = ");
			double creditScore = sc.nextDouble();
			double interestRate = uClass.findInterestRate(creditScore);
			
			double totalPrice = uClass.calculateTotalPrice(basePrice, interestRate);
			System.out.println("Calculated total price is = "+totalPrice);
			
			System.out.print("Enter loan term (in year) = ");
		    double loanTerm = sc.nextDouble();
	        
	        double monthlyPayment = uClass.getMonthlyPayment(loanTerm, totalPrice);
			System.out.printf("Calculated monthly payment = %.2f", monthlyPayment);	

	}

}
