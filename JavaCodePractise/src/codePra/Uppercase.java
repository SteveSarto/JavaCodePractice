package codePra;

public class Uppercase {

	public static void main(String[] args) {
		String name= "Steve";
		
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i%2==0) {
				if(ch[i]>'a'&&ch[i]<'z')
				ch[i]= (char) (ch[i]-32);
			}
			name = new String(ch);
		}
		
		System.out.print(name);

	}

	
}
