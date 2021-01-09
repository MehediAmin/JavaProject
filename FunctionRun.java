

public class FunctionRun {
	Function fc = new Function();
	int num1 = 10, num2 = 20, num3 = 30;
	int sum = fc.add3Numbers(num1, num2,num3);{
	System.out.println(sum);
	
	fc.printData("Test");
	
	int a = 100, b = 101;
	boolean isEqual = fc.checkEquality(a, b);
	if (isEqual) {System.out.println("Two numbers are equal");}
		else {System.out.println("Tow numbers are not equal");}
	
	fc.printName();
	
	fc.printboolean(true);}}


