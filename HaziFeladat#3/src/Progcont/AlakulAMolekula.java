package Progcont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlakulAMolekula {
    public static void main(String[] args) throws IOException {
        String sor;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Vegyjelek> lista = new ArrayList<>();
        List<Mol> result = new ArrayList<>();
        boolean vege = false;
        
        while((sor = br.readLine()) != null){
            if(sor.equals("0")) break;
            
            if(sor.equals("-")){
                vege = true;
                sor = br.readLine();
            }
            if(vege == false){
                String [] tomb = sor.split(":");
                lista.add(new Vegyjelek(tomb[0], tomb[1]));
            }

            if(vege == true){
               String [] tomb = sor.split("[:,]");
               result.add(new Mol(tomb[0]));
               
                for (int i = 1; i < tomb.length; i++) {
                    boolean van = false;
                    for (int j = 0; j < result.get(result.size() - 1).belso_lista.size(); j++) {
                        if(result.get(result.size() - 1).belso_lista.get(j).nev.equals(tomb[i])){
                            van = true;
                            result.get(result.size() - 1).belso_lista.get(j).db++;
                        }
                    }
                    if(van == false){
                        result.get(result.size() - 1).belso_lista.add(new Belso(tomb[i], 1));
                    }
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).belso_lista.size(); j++) {
                for (int k = 0; k < lista.size(); k++) {
                    if(lista.get(k).betu.equals(result.get(i).belso_lista.get(j).nev)){
                        result.get(i).belso_lista.get(j).nev = lista.get(k).nev;
                        break;
                    }
                }
            }
        }
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            Collections.sort(result.get(i).belso_lista);
        }
        
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).molekulaNev + ":");
            for (int j = 0; j < result.get(i).belso_lista.size(); j++) {
                System.out.println(result.get(i).belso_lista.get(j).db + " " + result.get(i).belso_lista.get(j).nev);
            }
        }
    }
}
class Vegyjelek{
    public String betu;
    public String nev;

    public Vegyjelek(String betu, String nev) {
        this.betu = betu;
        this.nev = nev;
    }
}
class Mol implements Comparable<Mol>{
    public String molekulaNev;
    List<Belso> belso_lista = new ArrayList<>();

    public Mol(String molekulaNev) {
        this.molekulaNev = molekulaNev;
    }

    @Override
    public int compareTo(Mol o) {
        return this.molekulaNev.compareTo(o.molekulaNev);
    }
}
class Belso implements Comparable<Belso>{
    public String nev;
    public int db;

    public Belso(String nev, int db) {
        this.nev = nev;
        this.db = db;
    }

    @Override
    public int compareTo(Belso o) {
        if(this.db == o.db)
            return this.nev.compareTo(o.nev);
        return o.db - this.db;
    }
}