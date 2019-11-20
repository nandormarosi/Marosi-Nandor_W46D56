package Progcont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZarthelyiEredmenyek{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        List<ZH> lista = new ArrayList<>();

        while ((sor = br.readLine()) != null) {
            String [] tomb = sor.split(";");
            boolean talalat = false;
            
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).nev.equals(tomb[0])){
                    lista.get(i).pont += Integer.parseInt(tomb[1]);
                    talalat = true;
                }                
            }
            if(talalat == false)
                lista.add(new ZH(tomb[0], Integer.parseInt(tomb[1])));
        }
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nev + ": " + lista.get(i).pont + " pont");
        }
    }
}

class ZH implements Comparable<ZH>{

    public String nev;
    public int pont;

    public ZH(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    @Override
    public int compareTo(ZH o) {
        if(this.pont == o.pont)
            return this.nev.compareTo(o.nev);
        return o.pont - this.pont;
    }
}
