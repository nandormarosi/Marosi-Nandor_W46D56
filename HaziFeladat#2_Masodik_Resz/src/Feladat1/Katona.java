package Feladat1;

public class Katona {
    private int tamadoEro;
    private int vedoEro;

    public int getTamadoEro() {
        return tamadoEro;
    }

    public void setTamadoEro(int tamadoEro) {
        this.tamadoEro = tamadoEro;
    }

    public int getVedoEro() {
        return vedoEro;
    }

    public void setVedoEro(int vedoEro) {
        this.vedoEro = vedoEro;
    }

    public Katona() {
        this.tamadoEro = 5;
        this.vedoEro = 5;
    }

    public Katona(int tamagoEro, int vedoEro) {
        this.tamadoEro = tamagoEro;
        this.vedoEro = vedoEro;
    }

    @Override
    public String toString() {
        return "TE: " + getTamadoEro() + ", VE: " + getVedoEro();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Katona))
            return false;
        
        Katona k = (Katona) obj;
        
        return k.getTamadoEro() == this.tamadoEro && k.getVedoEro() == this.vedoEro;
    }    
}
