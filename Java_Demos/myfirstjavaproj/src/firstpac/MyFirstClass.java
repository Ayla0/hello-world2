package firstpac;

import java.util.Date;
import java.util.GregorianCalendar;

//import java.util.date;

public class MyFirstClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(args[0]);
		
		// f indicates float, defaults to int
		float f = 1000.0f;
		
		// l indicates long, defaults to double
		long l = 10000000000l;
		
		// ctrl + shift + 'f' = format code
		// abstraction is basically black boxing, where the user doesn't care about how its written
		// if you follow the 5 principles java is secure by default
		
		Date d = new Date();
		GregorianCalendar g = new GregorianCalendar();

	}
	
	public void hello() {
		System.out.println(g);
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int mult(int x, int y) {
		return x * y;
	}
	
	int g;

}
