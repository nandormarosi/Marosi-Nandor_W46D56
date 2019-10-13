package Feladat3;

import java.util.Arrays;

public class Etterem extends VendeglatoipariEgyseg{
    private String [] etlap;

    public Etterem(String[] etlap, String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, dohanyzo);
        this.setDohanyzo(false);
        this.etlap = etlap;
    }

    @Override
    public String toString() {
        return super.toString() + "Etterem{" + "etlap=" + Arrays.toString(etlap) + '}';
    }   

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Etterem))
            return false;
        
        Etterem k = (Etterem)obj;
        
        return super.equals(k) && Arrays.equals(this.etlap, k.getEtlap());
    }
    
    
}
