package Feladat2;

public class Teszt {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        
        System.out.println(triangle.toString());
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("color: " + triangle.getColor() + " and filled: " + triangle.isFilled());        
    }    
}
