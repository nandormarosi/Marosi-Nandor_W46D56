package Feladat1;

public class Bor extends AlkoholosItal {
    private String szolofajta;
    private String termoTerulet;

    public Bor(String iz, double alkoholTartalom, String szolofajta, String termoTerulet) {
        super(iz, alkoholTartalom);
        this.szolofajta = szolofajta;
        this.termoTerulet = termoTerulet;
    }

    public String milyenSzolobolKeszult() {
        return szolofajta;
    }

    @Override
    public String mibolKeszult() {
        return szolofajta;
    }

    public String holTermett() {
        return termoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" + "szolofajta=" + szolofajta + ", termoTerulet=" + termoTerulet + '}';
    }   

    @Override
    public double alkoholTartalom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
