public class FindnthMagic {
    public static void main(String[] args) {
        int n=1;
        int base =5;
        int ans =0;
        //no. of digits should be identifeid using no of digit code
        while(n>0){
            int last = n&1;
            n=n>>1;
            ans = ans+last*base;
            base = base *5;
        }
        System.out.println(ans);
    }
}
