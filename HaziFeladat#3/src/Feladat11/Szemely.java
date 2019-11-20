package Feladat11;

public class Szemely implements Comparable<Szemely>{
    protected String nev;
    protected int eletkor;
    protected boolean ferfi;

    public Szemely(String nev, int eletkor, boolean ferfi) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.ferfi = ferfi;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public boolean isFerfi() {
        return ferfi;
    }

    public void setFerfi(boolean ferfi) {
        this.ferfi = ferfi;
    }

    @Override
    public String toString() {
        return this.nev + " " + this.eletkor + " " + this.ferfi;
    }

    @Override
    public int compareTo(Szemely o) {
        return Integer.compare(this.eletkor, o.eletkor);
    }
    
    
}
