package inheritance;

public class Student extends Person {
    String course;
    
    public Student(String name, int age, String course){
        super(name, age);
        this.course = course;

    }

    public void study(){
        System.out.println(name + " is studying " + course);
    }
}
