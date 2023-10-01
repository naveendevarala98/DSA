public class NoOfDigit {
    public static void main(String[] args) {
        //This code can be used to find the no of digits present in given number based on base
//        int n=3456;
//        int b=10;
        int n=10;
        int b=2;
        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
