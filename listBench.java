import java.util.Random;

public class listBench {
    public static void main(String[] args) {
        int k = 100_000;
        int contstantListLength = 99;
        int[] bencharray = { 99, 199, 299, 399, 499, 599, 699, 799, 899, 999, 1099, 1199, 1299, 1399, 1499, 1599};
        Random rnd = new Random();
        LinkedList variableList = new LinkedList(1);
        LinkedList constantList = new LinkedList(1);
        long t0 = 0;
        long tsum = 0;

        System.out.println("Runtimes for appending a variable length linked list to the end of a constant length linked list: ");

        for (int n : bencharray) {

            for (int i = 0; i < k; i++) {

                for (int l = 0; l < contstantListLength; l++) {
                    constantList.append(new LinkedList(rnd.nextInt(n)));
                }

                for (int l = 0; l < n; l++) {
                    variableList.append(new LinkedList(rnd.nextInt(n)));
                }

                t0 = System.nanoTime();
                constantList.append(variableList);
                tsum += System.nanoTime() - t0;
                constantList = new LinkedList(1);
                variableList = new LinkedList(1);

            }

            System.out.print("(" + (n+1) + "," + (tsum / k) + ")");

        }

        System.out.println("\n\n");

        System.out.println("Runtimes for appending a constant length linked list to the end of a variable length linked list: ");

        for (int n : bencharray) {

            for (int i = 0; i < k; i++) {

                for (int l = 0; l < contstantListLength; l++) {
                    constantList.append(new LinkedList(rnd.nextInt(n)));
                }

                for (int l = 0; l < n; l++) {
                    variableList.append(new LinkedList(rnd.nextInt(n)));
                }

                t0 = System.nanoTime();
                variableList.append(constantList);
                tsum += System.nanoTime() - t0;
                constantList = new LinkedList(1);
                variableList = new LinkedList(1);

            }

            System.out.print("(" + (n+1) + "," + (tsum / k) + ")");

        }

    }
}
