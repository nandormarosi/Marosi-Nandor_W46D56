package Progcont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KaracsonyiHozzavalok{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        List<Hozzavalok> lista = new ArrayList<>();

        while ((sor = br.readLine()) != null) {
            String [] tomb = sor.split(";");
            boolean talalat = false;
            
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).nev.equals(tomb[0])){
                    lista.get(i).darab += Integer.parseInt(tomb[1]);
                    talalat = true;
                }                
            }
            if(talalat == false)
                lista.add(new Hozzavalok(tomb[0], Integer.parseInt(tomb[1])));
        }
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nev + ";" + lista.get(i).darab);
        }
    }
}

class Hozzavalok implements Comparable<Hozzavalok>{

    public String nev;
    public int darab;

    public Hozzavalok(String nev, int darab) {
        this.nev = nev;
        this.darab = darab;
    }

    @Override
    public int compareTo(Hozzavalok o) {
        if(this.darab == o.darab)
            return this.nev.compareTo(o.nev);
        return o.darab - this.darab;
    }
}
