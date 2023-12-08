public class AdityaJain_RunningTime {

    public static void main(String[] args) {
        int [] num1 = {11,69,96,67,45,34,23,49,90,100};
        long sT1 = System.nanoTime();
        for (int i = 0; i < num1.length; i++){
            if (num1[i] == 10){
                System.out.println("Number found!");
                break;
            }
        }
        long ET1 = System.nanoTime();
        long runningTime1 = ET1 - sT1;

        int [] num2 = {31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        long sT2 = System.nanoTime();
        for (int i = 0; i < num2.length; i++){
            if (num2[i] == 30){
                System.out.println("30 Found!");
                break;
            }
        }
        long ET2 = System.nanoTime();
        long runningTime2 = ET2 - sT2;
        System.out.println("Running time is  " + runningTime1);
        System.out.println("Running time is  " + runningTime2);



    }
}