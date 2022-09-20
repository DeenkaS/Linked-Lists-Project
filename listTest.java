import java.util.Random;

public class listTest{
    public static void main(String []args){
        int k = 100;
        
        Random rnd = new Random();
        LinkedList test = new LinkedList(1);
        LinkedList test2 = new LinkedList(2);
        LinkedList test3 = new LinkedList(3);

        test.append(test2);
        test.append(test3);


        test.printlist();

        for(int i = 0; i < k; i++){
            test.append(new LinkedList(rnd.nextInt(100)));
        }
        test.printlist();
    }
}