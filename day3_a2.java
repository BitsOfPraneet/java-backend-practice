class Shape
{
    void draw()
    {
        System.out.println("Drawing a generic shape");
    }
}
class Circle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing a circle!");
    }
}
class Rectangle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing a rectangle!");
    }
}
public class day3_a2
{
    public static void main(String[] args)
    {
        Shape[] myShapes = new Shape[2];
        myShapes[0]=new Circle();
        myShapes[1]=new Rectangle();
        for(int i=0;i<2;i++)
        {
            myShapes[i].draw();
        }
    }
}