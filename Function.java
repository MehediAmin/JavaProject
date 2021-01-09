
public class Function {
	public int add3Numbers (int x, int y, int z) {
		return x+y+z;}
	
	public void printData (String xyz) {
		System.out.println(xyz);}
	
	public boolean checkEquality (int x, int z) {
		// the default value will be returned even if it is true
		boolean returnValue = false;
		// if default value is true then an else is needed to change the value
		if (x==z) {
			returnValue = true;}
        return returnValue;}
	
	public void printName() {
		System.out.println("Ironman");}
	
	public void printboolean(boolean x) {
		System.out.println(x);}}


