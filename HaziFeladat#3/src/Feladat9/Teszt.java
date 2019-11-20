package Feladat9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teszt {
    public static void main(String[] args) {
        List<Hatizsak> lista = new ArrayList<Hatizsak>();
        lista.add(new Hatizsak("Fila", 4, 4, false));
        lista.add(new Hatizsak("Adidas", 3, 3, true));
        lista.add(new Hatizsak("Nike", 13, 2, true));
        lista.add(new Hatizsak("Adidas", 10, 1, false));
        lista.add(new Hatizsak("Puma", 2, 4, true));
        lista.add(new Hatizsak("Puma", 6, 3, true));
        lista.add(new Hatizsak("Nike", 5, 2, false));
        lista.add(new Hatizsak("O'Neil", 11, 1, true));
        lista.add(new Hatizsak("Nike", 8, 5, true));
        lista.add(new Hatizsak("Puma", 10, 6, false));
        
        List<Hatizsak> l = kiirMarkSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenoSorrendben(lista);
        System.out.println(l);
    }
    
    public static List<Hatizsak> kiirMarkSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenoSorrendben(List<Hatizsak> lista){
        Collections.sort(lista);
        return lista;
    }
}
