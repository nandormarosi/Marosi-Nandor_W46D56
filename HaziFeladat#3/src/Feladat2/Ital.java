package Feladat2;

import java.util.Objects;

public class Ital implements Comparable<Ital>{
    protected String nev;
    protected String kiszereles;
    protected int ar;

    public Ital(String nev, String kiszereles, int ar) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return this.nev + ", " + this.kiszereles + ", " + this.ar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital))
            return false;
        
        Ital i = (Ital)obj;
        
        return this.nev.equals(i.getNev()) && this.kiszereles.equals(i.getKiszereles());
    }

    @Override
    public int compareTo(Ital o) {
        return this.ar - o.getAr();
    } 
}
