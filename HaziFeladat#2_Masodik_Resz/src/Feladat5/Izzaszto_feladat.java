package Feladat5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Izzaszto_feladat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        sor = br.readLine();
        String [] tomb = sor.split(" ");
        int szam = Integer.parseInt(tomb[0]);
        String varos = tomb[1];
        ArrayList<Homerseklet> lista = new ArrayList<>();
        
        while(szam > 0){
            sor = br.readLine();
            tomb = sor.split(":");
            
            lista.add(new Homerseklet(tomb[0], Integer.parseInt(tomb[1])));
            
            szam--;
        }
        Collections.sort(lista);
        boolean van = false;
        int fok = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).nev.equals(varos)){
                van = true;
                fok = lista.get(i).celsius;
            }
        }
        if(van == false)
            System.out.println("Missing data");
        else{
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).celsius > fok && !lista.get(i).nev.equals(varos))
                    System.out.println(lista.get(i).nev + " (" + lista.get(i).celsius + ")");
            }
        }
    }
}
class Homerseklet implements Comparable<Homerseklet>{
    public String nev;
    public int celsius;

    public Homerseklet(String nev, int celsius) {
        this.nev = nev;
        this.celsius = celsius;
    }   

    @Override
    public int compareTo(Homerseklet o) {
        if(this.celsius == o.celsius){
            return this.nev.compareTo(o.nev);
        }
        return o.celsius - this.celsius;
    }
}
