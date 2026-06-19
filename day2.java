class Student
{
    String name;
    int age;
    double gpa;

    Student(String name,int age,double gpa)
    {
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
}
class GraduateStudent extends Student
{
    String researchTopic;
    GraduateStudent(String name,int age,double gpa,String researchTopic)
    {
        super(name,age,gpa);
        this.researchTopic=researchTopic;
    }

    @Override
    public String toString()
    {
        return ("GraduateStudent{name='"+name+"',age="+age+",gpa="+gpa+",topic='"+researchTopic+"'}");
    }
}
public class day2
{
    public static void main(String[] args)
    {
        GraduateStudent gs1 = new GraduateStudent("Priya", 24, 9.5, "Artificial Intelligence");
        System.out.println(gs1);
        if (gs1 instanceof Student) { System.out.println("gs1 is a Student"); }
    if (gs1 instanceof GraduateStudent) { System.out.println("gs1 is a Grad Student"); }
    }
    
}