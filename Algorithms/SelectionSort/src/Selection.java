public class Selection {
// selection sort can be useful when storage/memory space is limited.
// Time complexity: Quadratic time, O(n^2) where n is number of elements of a data structure.
// Selection sort is not scalable
    
    static int min, temp;

    public static int[] Sort(int[] array)
    {
        for(int i =0; i<array.length;i++)
        {
            min=array[i];
            for(int j=i+1;j<array.length;j++)
            {
             if(array[j]<min)
             {
                 min=array[j];
                 temp=array[i];
                 array[i]=min;
                 array[j]=temp;
             }
            }

        }

        return array;
    }

}
