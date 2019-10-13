package Feladat3;

import java.util.Arrays;

public class Kocsma extends VendeglatoipariEgyseg {
    private String [] sorlap;

    public Kocsma(String[] sorlap, String nev, int ferohelyekSzama, boolean dohanyzo) {
        super(nev, ferohelyekSzama, dohanyzo);
        this.setDohanyzo(true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return super.toString() + "Kocsma{" + "sorlap=" + Arrays.toString(sorlap) + '}';
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Kocsma))
            return false;
        
        Kocsma k = (Kocsma)obj;
        
        return super.equals(k) && Arrays.equals(this.sorlap, k.getSorlap());
    }
    
    

    
    
    
}
