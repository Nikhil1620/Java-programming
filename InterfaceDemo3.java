
interface Demo
{
    int No = 11;
    void Display();
}

class Hello implements Demo
{
    public void Display()
    {
        System.out.println("Inside Display");
    }
} 

class InterfaceDemo3
{
    public static void main(String A[])
    {
        System.out.println(Demo.No);    // No is Public and Static
        // Demo.No = 12;                   // No is Final

        Hello hobj = new Hello();  

        hobj.Display();
    }
}