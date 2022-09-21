import java.util.Random;

public class appendingArray {
    public static void main(String []args){
        int k = 100_000;
        int[] bencharray = { 100,100,100,100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
        
        Random rnd = new Random();
        long t0 = 0;
        long tsum = 0;

        

        System.out.println("Runtimes for appending a variable length array to the end of a constant length array: ");

        for (int n : bencharray) {

            int[] variableArray = new int[n];
            int[] constantArray = new int[100];

            for (int i = 0; i < k; i++) {

                for (int l = 0; l < constantArray.length; l++) {
                    constantArray[l] = rnd.nextInt(n);
                }

                for (int l = 0; l < n; l++) {
                    variableArray[l] = rnd.nextInt(n);
                }

                t0 = System.nanoTime();
                appendarray(constantArray, variableArray);
                tsum += System.nanoTime() - t0;
                
            }
            
            System.out.print("(" + (n) + "," + (tsum / k) + ")");
            tsum = 0;

        }

        System.out.println("\n\n");

        System.out.println("Runtimes for appending a constant length array to the end of a variable length array: ");

        for (int n : bencharray) {

            int[] variableArray = new int[n];
            int[] constantArray = new int[100];

            for (int i = 0; i < k; i++) {

                for (int l = 0; l < constantArray.length; l++) {
                    constantArray[l] = rnd.nextInt(n);
                }

                for (int l = 0; l < n; l++) {
                    variableArray[l] = rnd.nextInt(n);
                }

                t0 = System.nanoTime();
                appendarray(variableArray, constantArray);
                tsum += System.nanoTime() - t0;
                
            }
            
            System.out.print("(" + (n) + "," + (tsum / k) + ")");
            tsum = 0;
 

        }





        
    }

    public static int[] appendarray(int[] a,int[] b){
        int[] appendedArray = new int[a.length + b.length];
        int lastpos = a.length;
        for(int i = 0; i < a.length; i++){
            appendedArray[i] = a[i];
        }

        for(int i = a.length; i > a.length + b.length; i++){
            appendedArray[i-1] = b[lastpos];
            lastpos++;
        }
        return appendedArray;
    }
}
