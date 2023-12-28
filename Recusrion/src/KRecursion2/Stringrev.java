package KRecursion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stringrev {
    public static void main(String[] args) {
        String str="baccad";
       // System.out.println(removea(str,0));
     //   System.out.println(removea1(str,""));

        //subseq
       // subseq("abc","");
     //   System.out.println(subseqret("abc",""));

        //iterative
        int[] a={1,2,2};
        List<List<Integer>> ans = subsei(a);
        for(List<Integer> n:ans){
            System.out.println(n);
        }
    }

    //method1: answer in parameter passing
    private static String removea1(String str, String ans){
        if(str.isEmpty()){
            return ans;
        }
        if(str.charAt(0) != 'a'){
            ans+=str.charAt(0);
        }
       return removea1(str.substring(1),ans);
    }

    //method2: checking in each body and returning the value from down calls
    private static String removea(String str,int i) {
        if(i==str.length()){
            return null;
        }
        if(str.charAt(i) != 'a'){
            return str.charAt(i) + removea(str,i+1);
        }else{
return removea(str,i+1);
        }
    }

    //subseq print
    private static void subseq(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        subseq(str.substring(1),ch+ans);
        subseq(str.substring(1),ans);
    }

    //subseq return
    private static ArrayList<String> subseqret(String str, String ans){
        if(str.isEmpty()){
           // System.out.println(ans);
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch=str.charAt(0);

         ArrayList<String> left = subseqret(str.substring(1),ans+ch);

        ArrayList<String> right= subseqret(str.substring(1),ans);
        left.addAll(right);
         return left;
    }

    public static List<List<Integer>> subsei(int[] a){
        Arrays.sort(a);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start =0;
        int end=0;
        for (int i=0;i<a.length;i++){
            //duplicate
            if(i>0 && a[i] == a[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(a[i]);
                outer.add(internal);
            }

        }
        return outer;
    }
}
