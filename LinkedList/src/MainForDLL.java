public class MainForDLL {

    public static void main(String[] args) throws Exception {
        DoublyLinkList list = new DoublyLinkList();

        list.head = new DoublyLinkList.Node(1);
        DoublyLinkList.Node second = new DoublyLinkList.Node(2);
        DoublyLinkList.Node third = new DoublyLinkList.Node(4);
        DoublyLinkList.Node fourth = new DoublyLinkList.Node(5);

        list.head.previous=null;
        list.head.next=second;

        second.previous = list.head;
        second.next = third;

        third.previous = second;
        third.next = fourth;

        fourth.previous=third;
        System.out.println("Before adding the new node");
        list.DisplayList();

        // let's add a node in front of the list, make it the head of the list using the previous pointer.

        DoublyLinkList.Node NewHead = new DoublyLinkList.Node(0);

        list.InsertStart(NewHead);
        System.out.println();
        System.out.println("After adding a new node before head and making it the new head");
        list.DisplayList();

        // adding a node in between two nodes

        list.InsertNew(third, new DoublyLinkList.Node(9));

        System.out.println();
        System.out.println("After adding a new node in between two nodes");
        list.DisplayList();

        // deleting a node from the list

        list.DeleteNode(third.next);
        System.out.println();
        System.out.println("After deleting a node in between two nodes");
        list.DisplayList();
    }
}
