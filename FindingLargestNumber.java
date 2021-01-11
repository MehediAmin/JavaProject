import java.util.Scanner;

public class FindingLargestNumber {

	public static void main(String[] args) {
		int x[] = new int [3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 numbers in the console");
		
		for (int i = 0; i<3; i++) {
			x[i] = sc.nextInt();}
		
		int largestNum = x[0];
		for (int i = 0; i<=2; i++) {
			if (largestNum < x[i]){
				largestNum = x[i];}}
		
			System.out.println("The largest number is = "+largestNum);}}


