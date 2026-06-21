class MathHelper
{
    int multiply(int a,int b)
    {
        return a*b;
    }
    double multiply(double a,double b)
    {
        return a*b;
    }
}
public class day3_a1
{
    public static void main(String[] args)
    {
        MathHelper m1= new MathHelper();
        System.out.println(m1.multiply(10,5));
        System.out.println(m1.multiply(10.2,5.1));
    }
}