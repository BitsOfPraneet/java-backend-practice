class Student{
String name;
int rollNo;
Student(String n,int r){
    name=n;
    rollNo=r;
}
}
public class day1{
    public static void main(String[] args){
        Student s= new Student("Praneet",1);
        System.out.println("Student Details:");
        System.out.println("Name: "+s.name+"\n"+"Roll no. : "+s.rollNo);
    }
}
