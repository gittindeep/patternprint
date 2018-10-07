package com.pattern.print;

public class Driver {

	public static void main(String[] args) {

		
		//PrintPattern.Pattern1(11, '|');
		/**/
		int n = 19;
		int midchar1 = (n/2)+1;
		int counter=1;
		int midcounter=1;
		String str="";		
		
		//For Loop
		for(int i=1;i<=n/2;i++) {//loop to print number of lines
			
			for(int j=1;j<=midchar1-counter;j++) {
				str=str+"|";
			}
			for(int k=1;k<=midcounter;k++) {
				str=str+" ";
			}
			for(int l=midchar1+counter;l<=n;l++) {
				str=str+"|";
			}
			counter+=1;
			midcounter=midcounter+2;
			System.out.print(str);
			System.out.print("\n");
			str="";
		}
		int mid = (n/2)-1;
		str="";
		counter=1;
		int x=0;
		//int y=0;
		for(int i=1;i<=mid;i++) {
			
			for(x=0;x<=counter;x++) {
				str=str+"|";
			}
			counter+=1;
						
			
			System.out.print(str);
			System.out.print("\n");	
			str="";
		}
		
		
		
	}

}
