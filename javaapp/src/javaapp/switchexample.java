package javaapp;
  import java.util.Scanner;

public class switchexample {

	public static void main(String[] args) {
		Scanner vinay = new
				Scanner(System.in);
		System.out.println("enter a number (1-7)for the dayof the week:");
		int day = vinay.nextInt();
		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2 :
			System.out.println("monday");
			break;
		case 3 :
			System.out.println("tuesday");
			break;
		case 4:
			
			System.out.println("wednesday");
			break;
		case 5:
			
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break ;
		case 7:
			System.out.println("saturday");
			break;
			default:
				System.out.println("invalid day, 1 and 7 ");
						break;
		}
		vinay.close();
		
	}
	
			
		
				

	}


