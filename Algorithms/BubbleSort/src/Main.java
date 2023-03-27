public class Main {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        int[] Numbers = new int[4];
        int[] Numbers2 = new int[4];

        Numbers[0]=1;
        Numbers[1]=7;
        Numbers[2]=2;
        Numbers[3]=0;

        Numbers2=bubbleSort.SortUp(Numbers);

        for(int i=0;i<Numbers2.length;i++)
        {
            System.out.println("Value: "+Numbers2[i]);
        }
    }
}