abstract class Animal
{
    void sleep()
    {
        System.out.println("Zzz...");
    }
    abstract void makeSound();
}
interface Flyable
{
    void fly();
}
class Bird extends Animal implements Flyable{
    @Override
    void makeSound()
    {
        System.out.println("Chirp Chirp");
    }
    
    @Override
    public void fly()
    {
        System.out.println("Flapping Wings!");
    }
}
public class day3_b
{
    public static void main(String[] args){
    Bird b=new Bird();
    b.sleep();
    b.makeSound();
    b.fly();
}}