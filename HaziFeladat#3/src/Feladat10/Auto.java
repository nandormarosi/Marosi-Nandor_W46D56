package Feladat10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auto implements Comparable<Auto>{
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;
    private static int db;
    List<String> extrak = new ArrayList<>();

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
        db++;
    }

    public int getDb() {
        return db;
    }
    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendszam=" + rendszam + ", teljesitmeny=" + teljesitmeny + ", automata=" + automata + '}' + "rendszám helyessége: " +
                helyesRendszam();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Auto))
            return false;
        
        Auto a = (Auto) obj;
        
        return this.rendszam.equals(a.getRendszam());
    }
    
    public boolean helyesRendszam(){
        if(this.rendszam.length() != 6) return false;
        boolean helper = false;
        if(Character.isLetter(this.rendszam.charAt(0)) && Character.isLetter(this.rendszam.charAt(1)) & Character.isLetter(this.rendszam.charAt(2)) &&
                Character.isDigit(this.rendszam.charAt(3)) && Character.isDigit(this.rendszam.charAt(4)) && Character.isDigit(this.rendszam.charAt(5)))
                helper = true;
        if(helper == false)
            return false;
        return true;
    }
    
    public int darab(){
        int szam = getDb();
        return szam;
    }

    @Override
    public int compareTo(Auto o) {
        return Integer.compare(o.getTeljesitmeny(), this.getTeljesitmeny());
    }
}
