package Feladat6;

public class LinearEquation {
    
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    
    public boolean isSolvable(){        
        if(((this.getA() * this.getD()) - (this.getB() * this.getC())) == 0)
            return false;
        
        return true;
    }
    
    public double getX(){
        double eredmeny;
        
        eredmeny = ((this.getE() * this.getD()) - (this.getB() * this.getF())) / ((this.getA() * this.getD()) - (this.getB() * this.getC()));
        
        return eredmeny;
    }
    
    public double getY(){
        double eredmeny;
        
        eredmeny = ((this.getA() * this.getF()) - (this.getE() * this.getC())) / ((this.getA() * this.getD()) - (this.getB() * this.getC()));
        
        return eredmeny;
    }

    @Override
    public String toString() {
        if(isSolvable())
            return "X eredménye: " + getX() + ", Y eredménye: " + getY();
        else
            return "The equation has no solution.";
    }
    
    
}
