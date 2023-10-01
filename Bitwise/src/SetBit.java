public class SetBit {

    public static void main(String[] args) {
        int n=45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBit(n));
    }

    private static int setBit(int n){
        int c=0;
//        while(n>0){
//            c++;
//            n-= (n & -n);
//        }

        while(n>0){
            c++;
            n=n&(n-1);
        }
        return c;
    }
}
