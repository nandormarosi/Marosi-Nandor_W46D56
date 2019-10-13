package Feladat3;

import java.util.Arrays;

public class Teszt {
    private static Kocsma [] adottItal(String ital, VendeglatoipariEgyseg [] ve){
        
        int k = 0;
        for (int i = 0; i < ve.length; i++) {
            if(ve[i] instanceof Kocsma){
                Kocsma p = (Kocsma)ve[i];
                
                for (int j = 0; j < p.getSorlap().length; j++) {
                    if(p.getSorlap()[j].equals(ital))
                        k++;
                }
            }
        }
        Kocsma [] kocsma = new Kocsma[k];
        k = 0;
        
        for (int i = 0; i < ve.length; i++) {
            if(ve[i] instanceof Kocsma){
                Kocsma p = (Kocsma)ve[i];
                
                for (int j = 0; j < p.getSorlap().length; j++) {
                    if(p.getSorlap()[j].equals(ital)){
                        kocsma[k] = p;
                        k++;
                    }
                }
            }
        }
        return kocsma;
    }   
    
    public static void main(String[] args) {
        VendeglatoipariEgyseg [] v = new VendeglatoipariEgyseg[]{
            new Etterem(new String [] {"Kenyer", "Zsemle", "Kifli"}, "Semmi1", 10, false),
            new Etterem(new String [] {"Kenyer", "Zsemle", "Kifli"}, "Semmi2", 20, false),
            new Etterem(new String [] {"Kenyer", "Zsemle", "Kifli"}, "Semmi3", 30, false),
            new Etterem(new String [] {"Kenyer", "Zsemle", "Kifli"}, "Semmi4", 40, false),
            new Etterem(new String [] {"Kenyer", "Zsemle", "Kifli"}, "Semmi5", 50, false),            
            
            new Kocsma(new String [] {"Sor", "Bor", "Palinka"}, "Valami1", 10, true),                
            new Kocsma(new String [] {"Sor", "Gin", "Bor"}, "Valami2", 20, true),                    
            new Kocsma(new String [] {"Gin", "Whiskey", "Palinka"}, "Valami3", 30, true),                    
            new Kocsma(new String [] {"Sor", "Whiskey", "Tatra"}, "Valami4", 40, true),                    
            new Kocsma(new String [] {"Rum", "Konyak", "Likor"}, "Valami5", 50, true)               
        };
        Kocsma [] kocsma = adottItal("Konyak", v);
        System.out.println("A keresésre az eredmény/eredmények: " + Arrays.toString(kocsma));
    }
}
