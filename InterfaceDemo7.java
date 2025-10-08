
interface A
{
    int No = 11;
    void fun();
}

interface B
{
    int No = 21;
    void fun();
}

class Hello implements A,B    //Multiple-inheritance
{
    public void fun()
    {
        System.out.println("Inside fun"+A.No);     //No generates Error
    }

}

class InterfaceDemo7
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
        hobj.fun();
        

    }
}