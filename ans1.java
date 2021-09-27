import java.util.*;

//Abstract class implementation

public abstract class Wrestler {
    public abstract void themeMusic();
    public abstract void finisher();
}

public class Kane extends Wrestler{

    @Override
    public void themeMusic() {
        System.out.println("Kane's Intro music...");
    }
    @Override
    public void finisher() {
        System.out.println("Kane's finishing TombStone...");
    }
}

public class Main {
    public static void main (String [] args) {
        Wrestler wrestler1= new Kane();

        wrestler1.themeMusic();
        wrestler1.paymentForWork(5);
        wrestler1.finisher();
    }
}


//Interface impletation
interface Polygon_Shape {
    void calculateArea(int length, int breadth);
}
 
class Rectangle implements Polygon_Shape {
    public void calculateArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}
 
class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();       
        rect.calculateArea(10, 20);            
    }
}