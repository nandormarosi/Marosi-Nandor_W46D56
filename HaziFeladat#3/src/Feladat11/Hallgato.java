package Feladat11;

public class Hallgato extends Szemely{
    private double atlag;

    public Hallgato(double atlag, String nev, int eletkor, boolean ferfi) {
        super(nev, eletkor, ferfi);
        this.atlag = atlag;
    }

    public double getAtlag() {
        return atlag;
    }
    @Override
    public String toString() {
        return super.toString() + " " + this.atlag;
    }
    
    public boolean joKepessegu(){
        if(this.atlag >= 4)
            return true;
        
        return false;
    }    
}
