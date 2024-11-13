package javaapp;

import java.util.Scanner;

public class ifelseifladderexanple {
	
 
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("ente your score ");
		int score= s.nextInt();
		if (score >=90) {
			System.out.println("grade: a");
		}
			else if (score >=80) {
				System.out.println("grade: b");
			}
				else if (score >= 70) {
					System.out.println("grade: c");
				}
					else if (score >=60) {
						System.out.println("grade: d");
					}
						else {
							System.out.println("grade: f");
						
						}
						s.close();
                      }
					
				
			}

	
		


	


