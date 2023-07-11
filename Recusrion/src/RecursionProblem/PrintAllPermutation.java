package RecursionProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		
		n=in.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		
		List<List<Integer>> ansList = new ArrayList<>();
		recPerm(0, a, ansList);
		for(int i=0;i<ansList.size();i++) {
			System.out.println(ansList.get(i));
		}

	}
	
	static void recPerm(int index, int[] a, List<List<Integer>> ansList) {
		
		if(index==a.length) {
			List<Integer> ds = new ArrayList<>();
			for(int i=0;i<a.length;i++) {
				ds.add(a[i]);
			}
			ansList.add(new ArrayList<>(ds));
		}
		
		for(int i=index;i<a.length;i++) {
			swap(i,index,a);
			recPerm(index+1,a, ansList);
			swap(i,index,a);
		}
	}
	
	static void swap(int i, int j, int[] a) {
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}

}
