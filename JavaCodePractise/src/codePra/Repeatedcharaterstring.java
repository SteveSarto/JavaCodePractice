package codePra;

public class Repeatedcharaterstring {

	public static void main(String[] args) {
	String s= "lionen";
	
	for(int i=0;i<s.length();i++) {
		char ch= s.charAt(i);
		boolean repeat =false;
		for(int j=i+1;j<s.length();j++) {
			if(ch==s.charAt(i)) {
				repeat=true;
				break;
			}
		}
			if(repeat==false) {
				System.out.println(ch +" is repeated");
				break;
			}
		}
		
	
	
	}

	}


