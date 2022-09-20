import java.util.Random;

public class Listproj{
    public static void main(String []args){
        Random rnd = new Random();
        LinkedList test = new LinkedList(1, null);
        LinkedList test2 = new LinkedList(2, null);
        LinkedList test3 = new LinkedList(3, null);

        test.append(test2);
        test.append(test3);


        test.printlist();
    }
}