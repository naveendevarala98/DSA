package RecursionProblem;

public class SumN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = sumNatural(3);
		System.out.println(s);

	}
	
	static int sumNatural(int n) {
		
		if(n==0)
			return 0;
		
		return n+sumNatural(n-1);
		
	}

}
