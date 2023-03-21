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
public class SimpleLinkList {

/* Simple Linked List or Singly Linked List. In this type of linked list,
one can move or traverse the linked list in only one direction, where the next pointer of each node points
to other nodes but the next pointer of the last node points to NULL.
*/

Node head; // head of the list


// Inner class
static class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        next=null;
    }

}

public void DisplayList()
{
    Node n = head;
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

