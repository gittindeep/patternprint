package com.pattern.print;

//import java.awt.List;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.Scanner;

public class PatternFor {
	
	public synchronized void Print(char x, int count) {
		
		int i=1;
		//Object LOCK = new Object();

		for(i=1;i<=count;i++) {
			System.out.print(x);
			try {
				wait(5);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

	
		}
	}
	public static void main(String[] args) {

		PatternFor p1 = new PatternFor();
		int n =21;
		char x ='|';
		char y = ' '; 
		//Scanner sc = new Scanner(System.in);
		//n=sc.nextInt();
		
		int i,spacecounter;
		
		int hmid = (n/2)+1;
		int vmid = ((n-2)/2)+1;
		
		p1.Print(x, n);
		System.out.println();
		spacecounter=1;
		for(i=1;i<=vmid;i++) {
			
			p1.Print(x, hmid-i);
			p1.Print(y,spacecounter);
			p1.Print(x,hmid-i);
			System.out.println();
			spacecounter+=2;			
		}

		for(i=vmid;i>=1;i--) {
			spacecounter-=2;
			p1.Print(x,hmid-i);
			p1.Print(y,spacecounter);
			p1.Print(x,hmid-i);
			System.out.println();
		}
		p1.Print(x, n);

		System.out.println();
		
		
	}

}
