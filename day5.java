class Student
{
    private String name;
    private int age;
    private double gpa;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if(age<0) System.out.println("Enter a positive value!");
        else this.age=age;
    }
    public double getGpa()
    {
        return gpa;
    }
    public void setGpa(double gpa)
    {
        if(gpa<0.0||gpa>10.0) System.out.println("Enter gpa between 0 and 10!");
        else this.gpa=gpa;

    }
}
public class day5{
    public static void main(String[] args)
    {
        Student s=new Student();
        s.setGpa(15.0);
        s.setGpa(9.01);
        System.out.println(s.getGpa());
    }
}