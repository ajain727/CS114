import java.util.Arrays;
public class Problem1 {
    public static void main(String[] args) {
        /* red = 0
           white = 1
           blue = 2
        */
        int red = 0;
        int blue = 0;
        int white = 0;
        int[] balls = {0,0,0,1,2,1,0,2,1};
        Arrays.sort(balls);
        System.out.println(Arrays.toString(balls));

        for(int i = 0; i<balls.length; i++){
            switch(balls[i]){
                case 0:
                    red++;
                    break;
                case 1:
                    white++;
                    break;
                case 2:
                    blue++;
                    break;
            }
        }
        System.out.println("The number of Red balls: " + red);
        System.out.println("The number of white balls: " + white);
        System.out.println("The number of blue balls: " + blue);
    }
}
