import java.util.Scanner;


class Dynamic
{
    public static void main(String A[]);
    {
        Scanner sobj = new Scanner(System.in);

        int Length = 0;
        int Arr[];

        System.out.println("Enter the number of elements: ");
        Length = sobj.nextInt();

        Arr = new int[Length];

        if(Arr == null)
        {
            System.out.println("Unable to allocate the memory");
        }
        else
        {
            System.out.println("Memory gets Scucessfully Allocated");
        }

    }
}