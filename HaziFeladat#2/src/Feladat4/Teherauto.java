package Feladat4;

public class Teherauto extends Auto{
    private int maxSzallithatoTeher;

    public Teherauto(int maxSzallithatoTeher, String rendszam, int motorTeljesitmeny) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }    

    @Override
    public String toString() {
        return super.toString() + " Teherauto{" + "maxSzallithatoTeher=" + maxSzallithatoTeher + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Teherauto))
            return false;
        
        Teherauto t = (Teherauto) obj;
        
        return super.equals(t)&& this.maxSzallithatoTeher == t.getMaxSzallithatoTeher();
    }  
}
