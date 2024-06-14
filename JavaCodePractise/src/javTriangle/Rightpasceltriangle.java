package javTriangle;

import java.util.Scanner;

public class Rightpasceltriangle {

		
		public static void main(String args[]) {
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int evenSum=0;
			int oddSum=0;


			for(int i=n;i>0;i++){
				int l=n%10;
				if(l%2==0){
					evenSum+=l;
				}
				else{
					oddSum+=l;
				}
				n=n/10;
			}
			System.out.println(evenSum +" "+oddSum);
			
		}
	}
