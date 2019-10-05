package Feladat3;

public class Rectangle {
    public double width;
    public double height;
    
    public Rectangle(){
        this.height = 1;
        this.width = 1;
    }   

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return this.height * this.width;
    }
    
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }

    @Override
    public String toString() {
        return "A téglalap szélessége = " + width + ", magassága = " + height + ", területe: " + getArea() + ", kerülete: " + getPerimeter();
    } 
}
