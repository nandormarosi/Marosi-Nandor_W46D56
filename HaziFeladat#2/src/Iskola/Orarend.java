package Iskola;

public class Orarend{
    private String nap;
    private String [] tomb;
    private int szamlalo;

    public Orarend(String nap) {
        this.nap = nap;
        this.tomb = new String [12];
        this.szamlalo = 0;
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public String[] getTomb() {
        return tomb;
    }

    public void setTomb(String[] tomb) {
        this.tomb = tomb;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", tomb=" + tomb + ", szamlalo=" + szamlalo + '}';
    }   
    
    public boolean oratHozzaad(Ora obj){
        if(getSzamlalo() >= 12)
            return false;
        
       
        return true;
       
    }
}
