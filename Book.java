class Book {
     private String title;
     private String author;
     private double price;

     Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
     }

     //getters and setters methods
     public void setTitle(String title){
        this.title = title;
     }
     public void setAuthor(String author){
        this.author = author;
     }
     public void setPrice(double price){
        if (price < 0) {
            System.out.println("price can not be negative");
        } else {
        this.price = price;
        }
     }

     public String getTitle(){
        return this.title;
     }
     public String getAuthor(){
        return this.author;
     }
     public double getPrice(){
        return this.price;
     }


     public void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("author : " + author);
        System.out.println("price : " + price);

     }

}
