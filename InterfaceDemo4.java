
interface A
{
    void fun();
}

interface B
{
    void gun();
}

class Demo implements A,B    //Multiple-inheritance
{
    public void fun()
    {
        System.out.println("Inside fun");
    }

    public void gun()
    {
        System.out.println("Inside gun");
    }
}

class InterfaceDemo4
{
    public static void main(String A[])
    {
        Hello hobj = new Demo();
        hobj.fun();
        hobj.gun();

    }
}