package RecursionProblem;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=16;
		List<Integer> number = new ArrayList<>();
		int fact=1;
		for(int i=1;i<n;i++) {
			fact=fact*i;
			number.add(i);
		}
		number.add(n);
		String ans="";
		k=k-1;
		while(true) {
			ans = ans+number.get(k/fact);
			number.remove(k/fact);
			if(number.size()==0) {
				break;
			}
			
			k=k%fact;
			fact=fact/number.size();
		}
		System.out.print(ans);

	}

}
