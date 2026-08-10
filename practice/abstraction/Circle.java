package abstraction;

public class Circle extends Shape{
    private int radius;

    @Override
    public int calculateArea(){
        return radius^2;
    }

}