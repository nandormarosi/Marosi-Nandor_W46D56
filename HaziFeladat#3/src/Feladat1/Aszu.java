package Feladat1;

public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(int puttonySzam, String iz, double alkoholTartalom, String szolofajta, String termoTerulet) {
        super(iz, alkoholTartalom, szolofajta, termoTerulet);
        this.puttonySzam = puttonySzam;
    }

    public int hanyPuttonyos(){
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}' + super.toString();
    }
}
