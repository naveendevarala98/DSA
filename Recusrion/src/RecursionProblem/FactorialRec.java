package RecursionProblem;

public class FactorialRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = fact(4);
		System.out.println(n);

	}

	static int fact(int n) {
		if(n<=1)
			return n;
		
		return fact(n-1)+fact(n-2);
	}
}
