package Feladat11;

public class Oktato extends Szemely{
    public String tanszek;

    public Oktato(String tanszek, String nev, int eletkor, boolean ferfi) {
        super(nev, eletkor, ferfi);
        this.tanszek = tanszek;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.tanszek;
    }
    
    
}
