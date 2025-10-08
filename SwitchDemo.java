
import java.util.Scanner;

class SwitchDemo
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner (System.in);

        int iStd = 0;

        System.out.println("Enter your Standard : ");
        iStd = sobj.nextInt(); 

        switch(iStd)
        {
            case 1:
                System.out.println("Exam is at 9 AM");
                break;

            case 2:
                System.out.println("Exam is at 10 AM");
                break;
            
            case 3:
                System.out.println("Exam is at 11 AM");
                break;
            
            case 4:
                System.out.println("Exam is at 12 noon");
                break;
            
            default:
                System.out.println("Invalid Standard");
        }
    }
}