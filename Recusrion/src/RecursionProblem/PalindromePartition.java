package RecursionProblem;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabb";
		List<String> path = new ArrayList<>();
		List<List<String>> res = new ArrayList<>();
		func(0,s,path,res);
		for(List<String> l: res) {
			System.out.print(l.toString());
		}

	}
	
	static void func(int index, String s, List<String> path, List<List<String>> res) {
		if(s.length()==index) {
			res.add(new ArrayList<>(path));
			return;
		}
		
		for(int i=index;i<s.length();i++) {
			if(isPalindrome(s,i,index)) {
				path.add(s.substring(index,i+1));
				func(i+1, s, path, res);
				path.remove(path.size()-1);
			}
		}
	}
	static	boolean isPalindrome(String s, int end, int start) {
		while(start<=end) {
			if(s.charAt(start++)!=s.charAt(end--))
				return false;
			
		}
		return true;
	}

}
