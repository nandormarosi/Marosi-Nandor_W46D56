package Feladat1;

public class Circle extends GeometricShape{
    private double radius;
    
    public Circle(){        
    }

    public Circle(double radius) {
        this.radius = radius;
    }    
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;    
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }
    
    public double getPerimeter(){
        return this.getRadius() * 2 * Math.PI;
    }
    
    public double getDiameter(){
        return this.getRadius() * 2;
    }  
}
