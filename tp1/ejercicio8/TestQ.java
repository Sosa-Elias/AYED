package tp1.ejercicio8;

public class TestQ {
    public static void main(String [] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(99);
        System.out.print(q.toString());
        q.enqueue(2);
        CircularQueue<Integer> cq = new CircularQueue<Integer>();
        cq.enqueue(9);
        cq.enqueue(99);
        cq.enqueue(78);
        System.out.print(cq.shift());
        System.out.print(cq.toString());
        DoubleEndedQueue<Integer> de = new DoubleEndedQueue<Integer>();
        de.enqueue(10);
        de.enqueue(20);
        de.enqueue(30);
        de.enqueueFirst(1);
        System.out.print("\n" + de);
    }
}
