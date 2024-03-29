package introduction;

import java.util.Scanner;

public class vovelswitch {

	public static void main(String[] args) {
		
		System.out.println("Enter the character");
		Scanner sc=new Scanner(System.in);
		
		char input=sc.next().toCharArray()[0];      //it will only pick char at 0 i.e first character.
		sc.close();
		//Alternate is convert to string.
		
		switch(input)
		{
			case 'a','e','i','o','u' :
				System.out.println("Character is vovel");
			break;
			default :
				System.out.println("Not a vovel");
				
		}

	}

}
