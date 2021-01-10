
public class Function2 {
	public double findInterestRate (double creditScore) {
		double interestRate;
		if (creditScore >= 760) {
			interestRate = 1.5;
		} else if (creditScore >= 700) {
			interestRate = 3;
		} else if (creditScore >= 650) {
			interestRate = 4;
		} else if (creditScore >= 600) {
			interestRate = 5;
		} else {
			interestRate = 0;
		}
		return interestRate;
		}
	public double calculateTotalPrice(double basePrise, double interestRate) {
		double interestAmount = basePrise * interestRate / 100;
		double totalPrice = basePrise + interestAmount;
		return totalPrice;
	}
	public double getMonthlyPayment(double loanTerm, double totalPrice) {
		double monthlyPayment = totalPrice / loanTerm / 12;
		return monthlyPayment;
	}}
