package codePra;

public class Fibonicis {

	public static void main(String[] args) {
		int n=10, firstnum = 0, secondnum=1;
		int nextnum;
		
		for(int i=0;i<=n;i++) {
			System.out.print(firstnum + ", " );
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			
		}
		

	}

}
