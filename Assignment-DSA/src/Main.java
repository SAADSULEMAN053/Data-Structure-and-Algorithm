public class Main {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();
// creating nodes
        linkedList.head = new LinkedList.Node(0);
        linkedList.tail = new LinkedList.Node(0);

        LinkedList.Node first = new LinkedList.Node(10);
        LinkedList.Node second = new LinkedList.Node(30);
        LinkedList.Node third = new LinkedList.Node(40);
        LinkedList.Node fourth = new LinkedList.Node(50);
// linking the nodes
        linkedList.head.next = first;
        linkedList.head.previous = linkedList.tail;

        first.previous = linkedList.head;
        first.next = second;

        second.previous = first;
        second.next = third;

        third.previous = second;
        third.next = fourth;

        fourth.previous= third;
        fourth.next = linkedList.tail;

        linkedList.tail.next = linkedList.head;
        linkedList.tail.previous = fourth;
// display
        linkedList.DisplayList();

// appending to start
        linkedList.addStart(5);
// appending to end
        linkedList.addEnd(55);

        System.out.println();
        System.out.println("After the adding the to start and end");
        linkedList.DisplayList();
// deleting start
        linkedList.deleteStart();

        System.out.println();
        System.out.println("After deleting start");
        linkedList.DisplayList();
// deleting end
        linkedList.deleteEnd();
        System.out.println();
        System.out.println("After deleting end");
        linkedList.DisplayList();
// displaying size
        System.out.println();
        linkedList.size();


        LinkedList secondlinkedList = new LinkedList();

// creating second linked list
        secondlinkedList.head = new LinkedList.Node(0);
        secondlinkedList.tail = new LinkedList.Node(0);

        LinkedList.Node fifth = new LinkedList.Node(600);
        LinkedList.Node sixth = new LinkedList.Node(500);
        LinkedList.Node seventh = new LinkedList.Node(60);
        LinkedList.Node eighth = new LinkedList.Node(200);
// linking the nodes
        secondlinkedList.head.next = fifth;
        secondlinkedList.head.previous = secondlinkedList.tail;

        fifth.previous = secondlinkedList.head;
        fifth.next = sixth;

        sixth.previous = fifth;
        sixth.next = seventh;

        seventh.previous = sixth;
        seventh.next = eighth;

        eighth.previous= seventh;
        eighth.next = secondlinkedList.tail;

        secondlinkedList.tail.next = secondlinkedList.head;
        secondlinkedList.tail.previous = eighth;

        System.out.println("Second list:");
        secondlinkedList.DisplayList();
// sorting the list

        secondlinkedList.isSorted();

        System.out.println();
        System.out.println("Second list after sorting: ");
        secondlinkedList.DisplayList();



// concatinating 1st and 2nd list

        LinkedList concatedlist;
        concatedlist = LinkedList.ConcatCDLL(linkedList, secondlinkedList);

        System.out.println();
        System.out.println("List after concatination: ");
        concatedlist.DisplayList();
// creating a separate link

        LinkedList thirdlist = new LinkedList();

        thirdlist.head = new LinkedList.Node(0);
        thirdlist.tail = new LinkedList.Node(0);

        LinkedList.Node ninth = new LinkedList.Node(1500);
        LinkedList.Node tenth = new LinkedList.Node(20);

        thirdlist.head.next = ninth;
        thirdlist.head.previous = thirdlist.tail;

        thirdlist.tail.next = thirdlist.head;
        thirdlist.tail.previous = tenth;

        ninth.previous=thirdlist.head;
        ninth.next=tenth;

        tenth.next = thirdlist.tail;
        tenth.previous = ninth;

        System.out.println();
        System.out.println("Third list: ");
        thirdlist.DisplayList();
        thirdlist.isSorted();
        System.out.println();
        System.out.println("third list after sorting:");
        thirdlist.DisplayList();

        System.out.println();
        System.out.println("Concated list after sorting: ");
        concatedlist.isSorted();
        concatedlist.DisplayList();
// merging two lists

        concatedlist = LinkedList.MergeCDLL(concatedlist, thirdlist);
        System.out.println();
        System.out.println("List after merging: ");
        concatedlist.DisplayList();

    }
}