public class BubbleSort {

    int SIZE = 4;
    int temp;
    int[] T_Numbers = new int[SIZE];

    public int[] SortUp(int[] Numbers)
    {
        for(int i=0;i<Numbers.length;i++)
        {
            for(int j=i+1;j<Numbers.length;j++)
            {
                if(Numbers[i]>Numbers[j])
                {
                    temp=Numbers[i];
                    Numbers[i]=Numbers[j];
                    Numbers[j]=temp;
                }

            }
        }
        return Numbers;
    }

}
