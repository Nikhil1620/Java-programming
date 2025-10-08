
interface A
{
    void fun();
}

interface B
{
    void fun();
}

class Hello implements A,B    //Multiple-inheritance
{
    public void fun()
    {
        System.out.println("Inside fun");
    }

}

class InterfaceDemo6
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
        hobj.fun();
        

    }
}