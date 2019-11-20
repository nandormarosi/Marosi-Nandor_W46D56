package Feladat11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        Szemely sz = new Szemely("Mona Lisa", 20, false);
        System.out.println(sz);
        
        String sor;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Szemely [] szemely = new Szemely[4];
        int i = 0;
        
        while(i < 4){
            sor = br.readLine();
            String [] tomb = sor.split(" ");            
            
            if(tomb[2].equals("true") && i < 2)
                szemely[i] = new Hallgato(Double.parseDouble(tomb[3]), tomb[0], Integer.parseInt(tomb[1]), true);
            else if(tomb[2].equals("false") && i < 2)
                szemely[i] = new Hallgato(Double.parseDouble(tomb[3]), tomb[0], Integer.parseInt(tomb[1]), false);
            else if(tomb[2].equals("true") && i >= 2)
                szemely[i] = new Oktato(tomb[3], tomb[0], Integer.parseInt(tomb[1]), false);
            else if(tomb[2].equals("false") && i >= 2)
                szemely[i] = new Oktato(tomb[3], tomb[0], Integer.parseInt(tomb[1]), false);          
            i++;
        }
        
        for (int j = 0; j < szemely.length; j++) {
            System.out.println(szemely[j]);
        }
        
        Set<Szemely> s = new HashSet<>();
        s.add(new Hallgato(3.5, "János", 23, true));
        s.add(new Hallgato(5, "István", 23, true));
        s.add(new Hallgato(4, "Ferenc", 23, true));
        s.add(new Oktato("Szamitastudomany", "Béla", 34, true));
        
        System.out.println("Az átlag: " + atlag(s));
    }
    public static double atlag(Set<Szemely> set){
        double atlag = 0;
        int darab = 0;
        
        for (Szemely object : set) {
            if(object instanceof Hallgato){
                Hallgato hall = (Hallgato)object;
                if(hall.joKepessegu()){
                    atlag += hall.getAtlag();
                    darab++;
                }
            }
        }
        atlag /= darab;
        
        return atlag;
    }
    
}
