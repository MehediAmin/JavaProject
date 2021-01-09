
public class IfElse {

	public static void main(String[] args) {
int a = 20, b = 10;
		
		boolean x = (a==b);
		System.out.println(x);
		if (x){System.out.println("a is equal to b");}
		else if (a==b) {System.out.println("a is equal to b");}
		else{System.out.println("a is not equal to b");}
		
		boolean y = (a<b);
		System.out.println(y);
		if (y){System.out.println("a is less than b");}
		else if (a<b) {System.out.println("a is less than b");}
		else {System.out.println("a is not less than b");}
		
		boolean z = (a>b);
		System.out.println(z);
		if (z){System.out.println("a is greater than b");}


	}

}
