abstract class Animal{
    public abstract void status();

    public void info()
    {
        System.out.println("Abstract Hey!");
    }
}
interface Flyable{
    public void fly();
}
class bird extends Animal implements Flyable
{   
    @Override
   public void status()
   {
    System.out.println("A bird is speaking to you!");
   }
   @Override
   public void fly(){
    System.out.println("I am above flying!");
   }
}
class day4
{
     public static void main(String[] args)
    {
        bird b=new bird();
        b.status();
        b.fly();
    }
}