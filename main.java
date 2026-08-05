
class main {
    public static void main(String[] args) {
        Book Book1 = new Book("Java programing","James Gosling",35000);
        Book Book2 = new Book("clean code", "Robert Martin", 45000);

        Book1.displayInfo();
        Book2.displayInfo();

        Book1.setPrice(-100);
        Book1.setPrice(900);
        System.out.println(Book1.getPrice());

        Student student1 = new Student("John", 30, "Computer engineering");
        student1.introduce();
        student1.study();
    }
}

