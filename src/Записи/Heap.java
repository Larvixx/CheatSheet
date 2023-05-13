package Записи;

public class Heap {
    String name;
    String number;
    String nick;
    public static void main(String[] args) {
        Heap[] heap = new Heap[3];
        heap[0] = new Heap();
        heap[1] = new Heap();
        heap[2] = new Heap();
        heap[0].name = "Petr";
        heap[0].number = "Sidorov";
        heap[0].nick = "Junior";
        heap[1].name = "Alex";
        heap[1].number = "Petrov";
        heap[1].nick = "Middle";
        heap[2].name = "Sergei";
        heap[2].number = "Ivanov";
        heap[2].nick = "Senior";
        for (int i = 0; i < heap.length; i++) {
            System.out.println(heap[i].name+ " | "+heap[i].number+" | "+heap[i].nick );
        }
    }
}
