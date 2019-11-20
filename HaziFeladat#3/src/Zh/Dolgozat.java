package Zh;
import Egyetem.Pontozhato;

public class Dolgozat implements Pontozhato{
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }  

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
        if(this.pontszam == -1){
            System.out.println("Nem írt");
            return false;
        }
        else if(this.pontszam <= 35 && this.pontszam != -1)
            return false;
        
        return true;
    }   
}
