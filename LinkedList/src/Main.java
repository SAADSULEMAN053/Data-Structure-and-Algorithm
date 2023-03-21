import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {


        SimpleLinkList list = new SimpleLinkList();
        list.head= new SimpleLinkList.Node(1);
        SimpleLinkList.Node second = new SimpleLinkList.Node(2);
        SimpleLinkList.Node third = new SimpleLinkList.Node(3);

        list.head.next = second;
        second.next = third;
        System.out.println("Before adding the new Node");
        list.DisplayList();

        // let us create a new node and add it in between the 2nd and the 3rd node

        SimpleLinkList.Node extra = new SimpleLinkList.Node(5);

        second.next = extra;
        extra.next = third;

        System.out.println();
        System.out.println("After adding the new Node");
        list.DisplayList();

    }
}