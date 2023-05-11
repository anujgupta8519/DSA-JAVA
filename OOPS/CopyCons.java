package OOPS;

public class CopyCons {
    
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="krishna";
        s1.roll= 123;
        s1.pass ="asdf";
        Student s2 = new Student(s1);
    }
    
}
class Student{
    int roll;
    String name;
    String pass;
    //Copy Constructor
 
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
    Student(){
System.out.println("called");
    }
}
