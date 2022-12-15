package Problem1;

import java.util.*;

public class Circle{
	
	public static void main(String [] args)
	{ 
		int r;
		double area, circumference;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of Circle");
		r=sc.nextInt();
		
		area=(Math.PI)*r*r;
		circumference=2*(Math.PI)*r;
		
		System.out.println("Area of circle is:"+ area);
		System.out.println("Circumference of circle is:"+ circumference);
		
		sc.close();
		
		
	}
}