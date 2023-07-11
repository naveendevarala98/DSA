package RecursionProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Subsetsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		
		n=in.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		List<Integer> ans = new ArrayList<Integer>();
		
		//subset sum 
//		subSetI(0,a,n,0, ans);
//		Collections.sort(ans);
//		for(int i=0;i<ans.size();i++) {
//			System.out.println(ans.get(i));
//		}
		
		//unique subset of arrays
		List<List<Integer>> ansList = new ArrayList<>();
		subSetII(0, a, n, new ArrayList<>(), ansList);
		for(int i=0;i<ansList.size();i++) {
			System.out.println(ansList.get(i));
		}
		

	}
	
	static void subSetI(int i, int[] a, int n, int add, List<Integer> ans) {
		if(i==n){
			ans.add(add);
			return;
		}
		subSetI(i+1, a, n, add+a[i], ans);
		subSetI(i+1, a, n, add, ans);
	}
	
	static void subSetII(int ind, int[] a, int n, List<Integer> add, List<List<Integer>> ansList) {
		ansList.add(new ArrayList<>(add));
		for(int i=ind;i<n;i++) {
			if(i!=ind && a[i]==a[i-1]) continue;
			add.add(a[i]);
			subSetII(i+1,a,n,add,ansList);
			add.remove(add.size()-1);
		}
		
	}

}
