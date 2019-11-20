package Progcont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Osztalypenz{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        List<Osztaly> lista = new ArrayList<>();

        while ((sor = br.readLine()) != null) {
            String [] tomb = sor.split(";");
            boolean talalat = false;
            
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).nev.equals(tomb[0])){
                    lista.get(i).penz += Integer.parseInt(tomb[1]);
                    talalat = true;
                }                
            }
            if(talalat == false)
                lista.add(new Osztaly(tomb[0], Integer.parseInt(tomb[1])));
        }
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nev + ";" + lista.get(i).penz);
        }
    }
}

class Osztaly implements Comparable<Osztaly>{

    public String nev;
    public int penz;

    public Osztaly(String nev, int penz) {
        this.nev = nev;
        this.penz = penz;
    }

    @Override
    public int compareTo(Osztaly o) {
        if(this.penz == o.penz)
            return this.nev.compareTo(o.nev);
        return o.penz - this.penz;
    }
}
