class Student
{
    private String name;
    private int age;
    private double gpa;

    Student()
    {
        System.out.println("A new student is being created!");
    }

    Student(String name,int age,double gpa)
    {
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }

    public String toString()
    {
        return("Student{name='"+name+"', age="+age+", gpa="+gpa+"}");
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
    public double getGpa()
    {
        return gpa;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public void setAge(int age)
    {
        if(age < 0) System.out.println("Invalid Age!");
        else this.age=age;
    }

    public void setGpa(double gpa)
    {
        if(gpa<0.0||gpa>10.0) System.out.println("Invalid GPA!");
        else this.gpa=gpa;
    }
}
public class day4_a
{
    public static void main(String[] args)
    {
    Student s1=new Student("Praneet",21,9.4);
    s1.setGpa(15);
    System.out.println(s1);
    }
}