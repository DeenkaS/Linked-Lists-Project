import java.util.Random;
import java.util.random.*;
public class listBench {
    public static void main(String []args){
        int k = 100_000;
        int[] bencharray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
        Random rnd = new Random();
        LinkedList benchList = new LinkedList(1);
        long t0 = 0;
        long tsum = 0;

        for(int i = 0; i< 10 ;i++){
            
        }


        System.out.println("Runtimes for appending a linked list n times: ");

        for (int n : bencharray) {
            int[] array1 = new int[n];

            for (int i = 0; i < k; i++) {

                for (int j = 0; j < n; j++) {
                    array1[i] = rnd.nextInt(100);
                }

                for(int j = 0; j < n; j++){
                    
                }

                
            }

            System.out.print("(" + n + "," + (tsum / k)+ ")");

        }

    }
}
