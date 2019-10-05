package Feladat5;
public class QuadraticEquation {
    private double a;    
    private double b;    
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
    
     public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }
     
     public double getRoot1(){
         if(this.getDiscriminant() < 0)
             return 0;

        return (-this.b + (Math.sqrt(this.getDiscriminant()))) / (2 * this.a);
    }
   
    public double getRoot2(){
        if(this.getDiscriminant() < 0)
            return 0;

        return (-this.b - (Math.sqrt(this.getDiscriminant()))) / (2 * this.a);
    }

    @Override
    public String toString() {
        if(this.getDiscriminant() > 0)
            return "Első gyök: " + this.getRoot1() + " Második gyök: " + this.getRoot2();
        else if(this.getDiscriminant() == 0)
            return "Közös gyök: " + this.getRoot1();
        else
            return "The equation has no roots.";
    }
    
    
}
