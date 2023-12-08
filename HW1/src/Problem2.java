import java.util.Arrays;
public class Problem2 {
    /*
        Number is student is m

        */
   static String array(int[] arr){
       int diff = 0;
       int min = 0;
       int max = 0;
       Arrays.sort(arr);
       min = arr[0];
       max = arr[2];
       diff = max-min;
       return "Minimum Difference is " + diff ;

    }
    public static void main(String[] args) {
        int[] arr = {57,13,12,14,69,26,56};
        System.out.println(Problem2.array(arr));
    }
}
