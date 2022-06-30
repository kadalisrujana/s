package dhakshayani.trainee;

public class Permutation {
    public static void main(String[] args)
    {
        int[]  a= { 1, 2, 3};
        printPermutation(a,0);
    }
    static void printPermutation(int[] a,int index)
    {
        if(index==a.length)
        {
            printArray(a);
            return;
        }
        for(int i=index;i<a.length;i++)
        {
            swapping(a,i,index);
            printPermutation(a,index+1);
            swapping(a,i ,index);
        }


    }
    static void printArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ "");
        }
        System.out.println("");
    }
    static void swapping(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i]= a[j];
        a[j]= temp;

    }

}
