package introduction;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);                   //sc is object of scanner class.
		System.out.println("Enter first side");
		float side1= sc.nextFloat();
		System.out.println("Enter second side");
		float side2= sc.nextFloat();
		System.out.println("Enter third side");
		float side3= sc.nextFloat();
		sc.close();                                   //close scanner class to avoid leaks.
		
		if((side1 ==side2)&&(side2==side3)&&(side3==side1))
			{
				System.out.println("This is equilateral triangle");
			}
		else if((side1==side2)||(side1==side3)||(side2==side3))
			{
				System.out.println("This is isoceles triangle");
			
			}
		else
			{
				System.out.println("This is scalen triangle");
			}
		

	}

}
