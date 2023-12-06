package Pratik;

public class Casts {

	public static void main(String[] args) {
		byte b = 60;
		short s = 2500;
		char c;
		int i = -35_000_000;
		long l = 5_000_000_000l;
		float f = 5.62f;
		double d = 3.14;
		
		//Narrowing Conversions
		b = (byte) s;
		System.out.println("s: " + s + "\t\t\tb: " + b);
		
		i = (int) l; 	
		System.out.println("l: " + l + "\t\ti: " + i);
		
		i = (int) d;
		System.out.println("d: " + d + "\t\t\ti: " + i);
		
		f = (float) d;
		System.out.println("d: " + d + "\t\t\tf: " + f);
		
		i = 57;
		c = (char) i;
		System.out.println("i: " + i + "\t\t\tc: " + c);
		
		//Widening Conversions
		f = i;
		System.out.println("i: " + i + " \t\t\tf: " + f);
		
		l = 854_234_643_831_634l;
		f = l;
		System.out.println("l: " + l +  " \tf: " +f);
		
		d = l;
		System.out.println("l: " + l + " \td: " + d);
		
		c = 85;
		i = c;
		System.out.println("c: " + c + " \t\t\ti: " + i);
		}
}
