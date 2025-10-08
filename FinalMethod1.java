
class Base
{
   public void fun()   //Definition
   {}
   public void gun()   //Definition
   {}
}

class Derived extends Base
{
    public void run()  //Definition
    {}
    public void gun()  //Overidding
    {}
}

class FinalMethod1
{
    public static void main(String A[])
    {
        Base bobj = new Base();
    }
}