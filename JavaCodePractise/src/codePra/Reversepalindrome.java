package codePra;

import java.util.Scanner;

public class Reversepalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		String reversed ="";
		for(int i=word.length()-1;i>=0;i--) {
			reversed= reversed + word.charAt(i);
		//	System.out.println(reversed);
		}
		System.out.println(reversed);
		if(word.equals(reversed)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
	

}
