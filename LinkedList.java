public class LinkedList {
    int head;
    LinkedList tail;

    public LinkedList(int item, LinkedList list) {
        this.head = item;
        tail = list;
    }

    public int head() {
        return this.head;
    }

    public LinkedList tail() {
        return this.tail;
    }

    public void append(LinkedList b) {
        LinkedList nxt = this;
        while (nxt.tail != null) {
            nxt = nxt.tail;
        }
        nxt.tail = b;
    }

    public void printlist(){
        LinkedList nxt = this;
        System.out.println(nxt.head);
        while (nxt.tail != null){
            System.out.println(nxt.tail.head);
            nxt = nxt.tail;
        }
    }

}