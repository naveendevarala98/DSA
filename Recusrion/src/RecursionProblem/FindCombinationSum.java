package RecursionProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindCombinationSum {

	public static void main(String[] args) {
		List<List<Integer>> ans = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int n;
		n=in.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
//		for(int i=0;i<n;i++) {
//			System.out.println(a[i]);
//		}
		//int target = 7;
		//findComb(0,a,target,ans, new ArrayList<>() );
		
		int target = 4;
		Arrays.sort(a);
		findCombII(0,a,target,ans, new ArrayList<>() );
		
		for(int i=0;i<ans.size();i++) {
			System.out.println("aa "+ans.get(i).toString());
		}

	}
	
	static void findComb(int ind, int[] a, int t, List<List<Integer>> ans, List<Integer> add) {
		if(ind == a.length){
			if(t==0) {
				ans.add(new ArrayList<>(add));
			}
			return;
		}
	//	System.out.println(ind);
		if(a[ind]<=t) {
			add.add(a[ind]);
			findComb(ind,a,t-a[ind],ans,add);
			add.remove(add.size()-1);
		}
		findComb(ind+1,a,t,ans,add);

}
	
	static void findCombII(int ind, int[] a, int t, List<List<Integer>> ans, List<Integer> add) {
	
			if(t==0) {
				ans.add(new ArrayList<>(add));
				return;
			}
			
	//	System.out.println(ind);
			for(int i=ind;i<a.length;i++) {
				if(i>ind && a[i]==a[i-1]) continue; 
				if(a[i]>t) break;
				
					add.add(a[i]);
					findCombII(i+1,a,t-a[i],ans,add);
					add.remove(add.size()-1);
				
			}

}
}
