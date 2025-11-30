package S1_MethodWithReturnType;

public class Demo1
{
    //method with int return type
    public static int add()
    {
        int a=10;
        int b=20;
        int sum=a+b;
        return sum;
    }

    public static int add(int a, int b)
    {
        int sum=a+b;
        return sum;
    }


    public static void main(String[] args)
    {
      int num1=add();
      System.out.println(num1);
      System.out.println(add());

        System.out.println("-------------");

       int num2=add(5,6);
        System.out.println(num2);

        System.out.println(add(7,8));

    }
}
