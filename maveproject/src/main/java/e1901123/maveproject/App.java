package e1901123.maveproject;

public class App 
{
	public static int add(int a, int b) {
		return a+b;
	}
	public static double divide(double a, double b) {
		
			return a/b;
	
	}
	public static String returnTwoChars(String a) {
		int length = a.length();
		if (length== 1) {
			return a.substring(0,1);
		}
		else if(length==0){
			return "";
			
		}
			else {
		
			return a.substring(0,2);
			}
	}
	
}

