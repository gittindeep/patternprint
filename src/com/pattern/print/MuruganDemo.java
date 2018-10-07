package com.pattern.print;

import java.util.Scanner;

public class MuruganDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		input.close();
		
		  
		for(int i=0;i<n;i++) {
			System.out.print("|");
			for(int f=1;f<n;f++) {
				System.out.print("|");
			
			}
			
			System.out.println();
			
			n--;	
					}

	}

}
