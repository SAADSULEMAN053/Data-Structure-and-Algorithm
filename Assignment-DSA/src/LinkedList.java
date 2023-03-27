public class LinkedList {

    Node head,tail;
    static int size = -2;
    static class Node
    {
        int data;
        Node next,previous;

        Node(int data)
        {
            this.data=data;
            next=null;
            previous=null;
            size+=1;
        }
    }

    public void addStart(int data)
    {
        Node node = new Node(data);

        node.next = head.next;
        head.next.previous = node;

        head.next = node;
        node.previous = head;
    }
    public void addEnd(int data)
    {
        Node node = new Node(data);
        node.previous = tail.previous;
        tail.previous.next = node;

        tail.previous = node;
        node.next = tail;

    }

    public void deleteStart()
    {
        head.next = head.next.next;
        head.next.previous = head;
        size-=1;
    }

    public void deleteEnd()
    {

     tail.previous = tail.previous.previous;
     tail.previous.next = tail;
     size-=1;
    }


    public void DisplayList()
    {
        Node current = head;

        if(head==null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            do
            {
                if(current!=head && current!=tail) {

                    System.out.print(" " + current.data);

                }
                current = current.next;

            }while(current!=head);
        }
    }

    public void size()
    {

        System.out.println("The size of the list is: "+ size);
    }

    public static LinkedList ConcatCDLL(LinkedList firstlist, LinkedList secondlist)
    {

        firstlist.tail.previous.next = secondlist.head.next;
        secondlist.head.next.previous = firstlist.tail.previous;

        secondlist.tail.previous.next = firstlist.tail;
        firstlist.tail.previous = secondlist.tail.previous;

        return firstlist;
    }
    public static LinkedList MergeCDLL(LinkedList firstlist, LinkedList secondlist)
    {
        firstlist.tail.previous.next = secondlist.head.next;
        secondlist.head.next.previous = firstlist.tail.previous;

        secondlist.tail.previous.next = firstlist.tail;
        firstlist.tail.previous = secondlist.tail.previous;

        firstlist.isSorted();

        return firstlist;
    }

    public void isSorted()
    {

        Node light = head;
        Node heavy = head.next;
        int temp;
        do
        {
            do
            {
                if(light != head && light != tail )
                {
                    if(light.data < heavy.data )
                    {
                        temp = light.data;
                        light.data=heavy.data;
                        heavy.data=temp;
                    }

                }
                heavy = heavy.next;
            }while(heavy!=head.next);

            light=light.next;
        }while(light!=head);

    }
}
