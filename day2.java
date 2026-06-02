class Person{
    void presentRole(){
        System.out.println("I am a person.");
    }
}
class Teacher extends Person{
    void presentRole(){
        System.out.println("Role: Teacher");
    }
}
class day2{
    public static void main(String[] args){
        Person p = new Teacher();
        p.presentRole();
    }
}