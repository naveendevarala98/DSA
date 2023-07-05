package RecursionProblem;

public class SumN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = sumNatural(3);
		System.out.println(s);
		sumNaturalParam(3,0);
	}
	
	static int sumNatural(int n) {
		
		if(n==0)
			return 0;
		
		return n+sumNatural(n-1);
		
	}
	
static void sumNaturalParam(int i, int sum) {
		
		if(i<0) {
			System.out.println(sum);
			return ;
			
		}
		sumNaturalParam(i-1,sum+i);
	}

}
