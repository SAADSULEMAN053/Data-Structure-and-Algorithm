// Like arrays, a Linked List is a linear data structure.
// Unlike arrays, linked list elements are not stored at a contiguous location;the elements are linked using pointers.
// They include a series of connected nodes.
// Here, each node stores the data and the address of the next node.

/*
 *  --> Basic Operations:
 *   ->Insert/add O(1)
 *   ->Delete/remove O(1)
 *   ->Search O(n)
 *   ->Display O(n)
 */

public class DoublyLinkList {

    //In this type of linked list, one can move or traverse the linked list in both directions (Forward and Backward)
    // Each node has address for next and previous node.
    /*  ----Advantages of DDL over SLL----
       ->A DLL can be traversed in both forward and backward directions.
       ->The delete operation in DLL is more efficient if a pointer to the node to be deleted is given.
       ->We can quickly insert a new node before a given node.
       ->In a singly linked list, to delete a node, a pointer to the previous node is needed. To get this previous node,
       sometimes the list is traversed. In DLL, we can get the previous node using the previous pointer.

    * */
    Node head;

    static class Node {

        int data;
        Node previous,next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }

    }

    public void InsertStart(Node head)
    {
        Node NewHead = head;

        NewHead.next = this.head;
        NewHead.previous = null;

        if (this.head != null)
            this.head.previous = NewHead;

        this.head = NewHead;
    }

    public void InsertNew(Node previous, Node NewNode)
    {
       Node node = NewNode;

       node.next=previous.next;
       node.previous= previous;
       previous.next=node;

       if(previous.next!=null){
       previous.next.previous=node;}
    }

    public void DisplayList()
    {
        DoublyLinkList.Node n = head;
        if(n==null)
        {
            System.out.println("The list is empty");
        }
        else {
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
        }
    }

}
