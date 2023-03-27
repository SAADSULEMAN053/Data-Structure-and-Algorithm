//Performing inserting in 0(1) time complexity using additional data structures.
// Note: This isn't a very efficient approach and the code also isn't written efficiently.

// Basic idea behind this code is that
/*
we know that
In Arrays:

Finding the point of insertion/deletion O(1)
Performing the insertion/deletion O(n)

In Linked Lists:

Finding the point of insertion/deletion O(n)
Performing the insertion/deletion O(1)

so I used Array list which is a dynamic array, to store the nodes
and then the actual insertion is performed using operations of linked list

so when I need to insert a node, in order to get the previous node I access it using arraylist indices
and then perform insertion using linked list function
in that way both operations are done in O(1) time
* */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        DoublyLinkList list = new DoublyLinkList();

        ArrayList<DoublyLinkList.Node> Nodes = new ArrayList<>();


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

        Nodes.add(0, list.head);
        Nodes.add(1, second);
        Nodes.add(2, third);
        Nodes.add(3,fourth);

        System.out.println("Before adding the new node");
        list.DisplayList();

        DoublyLinkList.Node additionalNode = new DoublyLinkList.Node(7);

        Nodes.add(4,Nodes.get(2).next);
        Nodes.remove(3);
        Nodes.add(3,additionalNode);

        list.InsertNew(Nodes.get(2),additionalNode);

        System.out.println();
        System.out.println("After adding a new node in between two nodes");
        list.DisplayList();

        System.out.println();
        for(int i=0;i<5;i++)
        {
            System.out.println(Nodes.get(i).data);
        }
    }
}
