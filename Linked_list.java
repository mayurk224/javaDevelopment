import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_list {

    // LinkedList class used a doubly linked list to store the elements.
    // it provides a linked list data structure

    // The important points about java LinkedList is:
    // LinkedList class can contain duplicate elements.
    // LinkedList class maintains insertion order.
    // LinkedList class is non synchronized
    // LinkedList class manipulation is fast because no shifting needs to occur.
    // LinkedList class can be used as a list, stack or queue

    // Advantages:
    // * the benefits of a linked list over a conventional array are that
    // the linked list elements can easily be inserted or removed without
    // reallocation or reorganization of the entire structure because the
    // data items need not be stored contiguously in memory or on disk.
    // Linked list allows insertion and removal of nodes at any point in
    // the list
    // * On the other hand, simple linked lists do not allow random access
    // to the data, or by using indexing, Thus, manu basic operations like
    // obtaining the last node of the list, or finding a node with required
    // data, or location the place where a new node should be inserted, may
    // require scanning most of the list elements.


    // Singly Linked List
    // A singly linked list is a fundamental data structure.
    // It consists of a sequence of elements called nodes,
    // where each node contains two parts:

    // Data Field: Stores the actual data.
    // Reference (Link): Points to the next node in the sequence.

    // The last node in a singly linked list points to null, indicating
    // the end of the list. This structure allows for efficient insertion
    // and deletion operations.


    public static class Book{
        int id, quantity;
        String name, author, publisher;

        public Book(int id, int quantity, String name, String author, String publisher) {
            this.id = id;
            this.quantity = quantity;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", quantity=" + quantity +
                    ", name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", publisher='" + publisher + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Book> list = new LinkedList<>();

        Book b1 = new Book(1,100,"Book1","me","me");
        Book b2 = new Book(2,100,"Book2","me","me");
        Book b3 = new Book(3,100,"Book3","me","me");

        list.add(b1);
        list.add(b2);
        list.add(b3);

        Iterator<Book> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }

}
