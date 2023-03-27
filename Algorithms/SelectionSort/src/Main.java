public class Main {
    public static void main(String[] args) {

        int[] array = {3,4,5,6,7,8,9,1,2};

        Selection.Sort(array);

        for(int i=0;i<array.length;i++)
        {
            System.out.print(" "+ array[i]);
        }
        /*
        1st - min = 3
        4<3 F
        5<3 F
        6<3 F
        7<3 F
        8<3 F
        9<3 F
        1<3 T {min=1, temp=3, 1,4,5,6,7,8,9,3,2}
        2<1 F

        2nd - min = 4
        ......
        6th T {min = 3, temp=4, 1,3,5,6,7,8,9,4,2}
        2<3 T {min = 2, temp=3, 1,2,5,6,7,8,9,4,3}
        * */
    }
}