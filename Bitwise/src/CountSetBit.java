public class CountSetBit {
    public static void main(String[] args) {
        int n=10;
        System.out.println(Integer.toBinaryString(n));
        int c=0;
        while(n>0){
            System.out.println(n);
            c+=n&1;
            n=n/2;
        }

        System.out.println(c);
    }
}
