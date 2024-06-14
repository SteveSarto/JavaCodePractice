package codePra;

public class UppercaseString {

	public static void main(String[] args) {
		String s= "Malayalam";
		for(int i=0; i<s.length();i++) {
			if(i%2==0)
			System.out.print(s.substring(i,i+1).toUpperCase());
			else
				System.out.print(s.substring(i, i+1).toLowerCase());
		}

	}

}
