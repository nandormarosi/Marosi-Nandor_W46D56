package Feladat2;

public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(){
        return getN() * getSide();
    }

    @Override
    public String toString() {
        return " --> " + "Oldalak száma = " + n + ", Oldalak hossza = " + side + ", x = " + x + ", y = " + y + ", Kerülete: " + getPerimeter() + ", Területe: " + getArea();
    }
    
    public double getArea(){
        double result = 0;
        double szog = 0;
        
        szog = (Math.cos(Math.toRadians(180 / getN()))) / (Math.sin(Math.toRadians(180 / getN()))) ;
        result = (Math.pow(getSide(), 2) * getN() / 4) * szog;
        
        return result;                
    }  
}
