
package circle.pkgclass;

/**
 *
 * @author Imran Shihan
 */
public class Circle{
    private double radius;
    //default constructor
    public Circle(){
        radius = 1.0;
    }
    //parameterized constructor
    public Circle(double radius){
        this.radius = radius;
    }
    //getter
    public double getRadius(){
        return radius;
    }
    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }
    //method to calculate area
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        
        System.out.println("Radius of c1: "+c1.getRadius()+", Area: "+c1.getArea());
        System.out.println("Radius of  c2: "+c2.getRadius()+", Area: "+c2.getArea());
    }
}
