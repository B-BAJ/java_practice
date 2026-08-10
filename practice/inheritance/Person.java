package inheritance;
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void introduce(){
        System.out.println("Hi, my name is " + name + " and am " + " years old");
    }

}
