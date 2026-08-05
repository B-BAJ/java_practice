class Book {
     private String title;
     private String author;
     private double price;

     Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
     }

     public void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("author : " + author);
        System.out.println("price : " + price);

     }

}

class main {
    public static void main(String[] args) {
        Book Book1 = new Book("Java programing","James Gosling",35000);
        Book Book2 = new Book("clean code", "Robert Martin", 45000);

        Book1.displayInfo();
        Book2.displayInfo();
    }
}

