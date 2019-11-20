package Feladat2;

public class SzeszesItal extends Ital{
    private double alkoholTartalom;

    public SzeszesItal(double alkoholTartalom, String nev, String kiszereles, int ar) {
        super(nev, kiszereles, ar);
        this.alkoholTartalom = alkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }
    
    @Override
    public String toString() {
        return this.alkoholTartalom + "% alkoholtartalmú " + super.toString();
    }   
}
