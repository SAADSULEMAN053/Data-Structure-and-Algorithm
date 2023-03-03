public class MyQueue {

    /*
    -> A queue is a useful data structure in programming. It is similar to the ticket queue outside a cinema hall,
    where the first person entering the queue is the first person who gets the ticket.

    -> Queue follows the First In First Out (FIFO) rule - the item that goes in first is the item that comes out first.

    -> Basic Operations:
    --> Enqueue : Add an Element at the end of the queue
    --> Dequeue : Remove an Element from the front of the queue
    --> IsEmpty : Check if queue is empty (returns true/false)
    --> IsFull : Check if queue is full (returns true/false)
    --> Peek/Front : Get the value from the front of the queue without removing it

    -> Pointers:
    --> Front: tracks the first element of the queue
    --> Rear/Back: tracks the last element of the queue

    -> Steps for Enqueue:
    --> check if the queue is full
    --> for the first element, set the value of FRONT to 0
    --> increase the REAR index by 1
    --> add the new element in the position pointed to by REAR

    -> Steps for Dequeue:
    --> check if the queue is empty
    --> return the value pointed by FRONT
    --> increase the FRONT index by 1
    --> for the last element, reset the values of FRONT and REAR to -1

    * */
    int SIZE = 10;
    int FRONT=-1,REAR=-1;
    int[] Item = new int[SIZE];

    public void Enqueue(int item)
    {
        if(IsFull()==false)
        {
            if(IsEmpty()==true)
            {
                FRONT=0;
                REAR+=1;
                Item[REAR]=item;
            }
            else
            {
                REAR+=1;
                Item[REAR]=item;
            }
        } else
        {
            System.out.println("Queue is Full.");
        }
    }

    public int Dequeue()
    {
        if(IsEmpty()==false)
        {
            if(FRONT==REAR)
            {

                int temp;
                temp=Item[FRONT];
                FRONT=-1;
                REAR=-1;
                return temp;

            } else
            {
                int temp;
                temp=Item[FRONT];
                FRONT++;
                return temp;
            }
        } else
        {
            System.out.println("Queue is Empty");
            return -1;
        }
    }

    public boolean IsEmpty()
    {
        if(REAR==-1 && FRONT==-1)
        {
            return true;
        }
        else {
        return false;
            }
    }
    public boolean IsFull() {

        if ( (Item.length-FRONT)-((Item.length-1)-REAR) == SIZE) {
            return true;
        } else {
            return false;
        }
    }
    public int Peek()
    {
        return Item[FRONT];
    }
    public void DisplayQueue()
    {
        if(IsEmpty()==false)
        {
            System.out.print("[ ");
            for(int i=FRONT;i<REAR+1;i++)
            {
                System.out.print( "  "+Item[i]);
            }
            System.out.println(" ]");
        } else
        {
            System.out.println("Queue is empty");
        }
    }

}
