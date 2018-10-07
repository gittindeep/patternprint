package com.pattern.print;

public class PrintPattern {

	public static void main(String[] args) {
		
		int n=7;
		String str="";
		int fill=1;
		
		for(fill=1;fill<=n;fill++) {
			
			str=str+"|";
		}
		
		char[] arr=str.toCharArray();
		char[] fullarr=str.toCharArray();

		int i=0;
		int mid = (n/2);
		
		System.out.print(fullarr);
		System.out.print("\n");
		for(i=0;i<mid;i++) {
			
			arr[mid+i]=' ';
			arr[mid-i]=' ';
			System.out.print(arr);
			System.out.print("\n");
		}
		
		//int j=0;
		n-=1;
		for(i=1;i<mid;i++) {
			
			arr[i]='|';
			arr[n-i]='|';
			System.out.print(arr);
			System.out.print("\n");
			
		}
		System.out.print(fullarr);
		System.out.print("\n");
		
	}
}
