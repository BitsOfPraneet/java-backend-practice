class Student
{
    String name;
    int age;
    double gpa;

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
}
    public class day1
    {
        public static void main(String[] args)
        {
            Student s1=new Student();
            Student s2=new Student("Rahul",19,9.1);
           System.out.println(s1);
           System.out.println(s2);
        }
    }
