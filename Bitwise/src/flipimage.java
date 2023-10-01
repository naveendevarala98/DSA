public class flipimage {

    public static void main(String[] args) {

    }

    private static int[][] flip(int[][] image){
        for(int[] row: image){
            for(int i=0;i<(image[0].length/2);i++){
                int t = row[i]^1;
                row[i] = row[image[0].length -i -1]^1;
                row[image[0].length-i-1] = t;
            }
        }
        return image;
    }
}
