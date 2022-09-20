import java.util.Random;

public class appendingArray {
    public static void main(String []args){
        int k = 100_000;
        int[] bencharray = { 99, 199, 299, 399, 499, 599, 699, 799, 899, 999, 1099, 1199, 1299, 1399, 1499, 1599};
        int[] constantArray = new int[100];
        Random rnd = new Random();

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};

        a = appendarray(a,b);

        for(int i = 0; i < a.length; i++)
        System.out.println(a[i]);

        





        
    }

    public static int[] appendarray(int[] a,int[] b){
        int[] appendedArray = new int[a.length + b.length];
        int bpos = b.length-1;
        for(int i = 0; i < a.length; i++){
            appendedArray[i] = a[i];
        }

        for(int i = a.length + b.length; i > a.length; i--){
            appendedArray[i-1] = b[bpos];
            bpos--;
        }
        return appendedArray;
    }
}
