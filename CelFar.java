import java.util.Scanner;

public class CelFar {

	public static void main(String[] args) {
		  double farenheit = 83.6;
			double celsius = (farenheit-32)*5/9;
			System.out.printf("Celsius Value = %.2f\n",celsius);
			
			double cel,far;
			
			System.out.print("Enter Celsius = ");
			Scanner input = new Scanner(System.in);
			cel = input.nextDouble();
			
			far = (cel*9/5)+32;
			System.out.printf("Farenheit is = %.2f\n",far);
			
			System.out.print("Enter Farenheit = ");
			Scanner input1 = new Scanner(System.in);
			far = input1.nextDouble();
			
			cel = (far-32)*5/9;
			System.out.printf("Celsius is = %.2f",cel);
	}

}
