package Feladat10;

public class Teherauto extends Auto{
    private int teherbiras;

    public Teherauto(int teherbiras, String rendszam, int teljesitmeny, boolean automata) {
        super(rendszam, teljesitmeny, automata);
        this.teherbiras = teherbiras;
    }

    public int getTeherbiras() {
        return teherbiras;
    }
    @Override
    public String toString() {
        return super.toString() + " teherbírás: " + this.teherbiras;
    }
    
    
}
