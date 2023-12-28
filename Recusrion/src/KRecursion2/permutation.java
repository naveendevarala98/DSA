package KRecursion2;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
//        String s="naveen";
//        System.out.println(s.substring(0,1));
//        System.out.println(s.substring(1,3));
     //   permutation("","abc");

        ArrayList<String> ans = permutationList("","abc");
        System.out.println(ans.toString());
    }

    public static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String e = p.substring(i,p.length());
            permutation(f+ch+e,up.substring(1));
        }
    }

    public static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
          //  System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch=up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String e = p.substring(i,p.length());
            ans.addAll(permutationList(f+ch+e,up.substring(1)));
        }
        return ans;
    }
}
