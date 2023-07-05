package RecursionProblem;

import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n;
		n=in.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		revArray(a,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	
	static void revArray(int[] a, int l, int r) {
		if(l>r) {
			return;
		}
		int t = a[l];
		a[l]=a[r];
		a[r]=t;
		revArray(a,l+1,r-1);
	}

}
