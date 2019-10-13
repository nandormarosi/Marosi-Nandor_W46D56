package Feladat1;

public class Nyilas extends Katona{
    private int lotav;

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }
            
    public Nyilas() {
    }    

    public Nyilas(int tamadoEro, int vedoEro, int lotav) {
        super(tamadoEro + lotav, vedoEro);
        this.lotav = lotav;
    }
    

    @Override
    public String toString() {
        return "Nyilas: TE: " + getTamadoEro() + ", VE: " + getVedoEro();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Nyilas))
            return false;
        
        Nyilas k = (Nyilas)obj;
        
        return super.equals(k) && k.getLotav() == this.lotav;
    }
    
    

    
    
    
}
