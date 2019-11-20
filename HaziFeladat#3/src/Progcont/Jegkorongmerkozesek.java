package Progcont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jegkorongmerkozesek {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        List<Jegkorong> lista = new ArrayList<>();
        
        while((sor = br.readLine()) != null){
            if(sor.equals("0")) break;
            String [] tomb = sor.split("[-:,]");

            boolean van = false;
            boolean van_1 = false;
            
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).csapatnev.equals(tomb[0]))
                    van = true;
                if(lista.get(i).csapatnev.equals(tomb[1]))
                    van_1 = true;
            }
            if(van == false)
                lista.add(new Jegkorong(tomb[0], 0, 0));
            if(van_1 == false)
                lista.add(new Jegkorong(tomb[1], 0, 0));           

            int hazai = 0;
            int vendeg = 0;
            
            for (int i = 2; i < tomb.length; i++) {
                if(i % 2 == 0)
                    hazai += Integer.parseInt(tomb[i]);
                else
                    vendeg += Integer.parseInt(tomb[i]);
            }

            boolean hosszabitas = false;
            if(tomb.length - 2 > 6)
                hosszabitas = true;
            
            if(hazai > vendeg){
                for (int i = 0; i < lista.size(); i++) {
                    if(lista.get(i).csapatnev.equals(tomb[0]) && hosszabitas == false){
                        lista.get(i).golok += hazai;
                        lista.get(i).pont += 3;
                        for (int j = 0; j < lista.size(); j++) {
                            if(lista.get(j).csapatnev.equals(tomb[1]))
                                lista.get(j).golok += vendeg;
                        }
                    }
                    if(lista.get(i).csapatnev.equals(tomb[0]) && hosszabitas == true){
                        lista.get(i).golok += hazai;
                        lista.get(i).pont += 2;
                        for (int j = 0; j < lista.size(); j++) {
                            if(lista.get(j).csapatnev.equals(tomb[1])){
                                lista.get(j).pont += 1;
                                lista.get(j).golok += vendeg;
                            }                                
                        }
                    }
                }
            }
            else if(hazai < vendeg){
                for (int i = 0; i < lista.size(); i++) {
                    if(lista.get(i).csapatnev.equals(tomb[1]) && hosszabitas == false){
                        lista.get(i).golok += vendeg;
                        lista.get(i).pont += 3;
                        for (int j = 0; j < lista.size(); j++) {
                            if(lista.get(j).csapatnev.equals(tomb[0]))
                                lista.get(j).golok += hazai;
                        }
                    }
                    if(lista.get(i).csapatnev.equals(tomb[1]) && hosszabitas == true){
                        lista.get(i).golok += vendeg;
                        lista.get(i).pont += 2;
                        for (int j = 0; j < lista.size(); j++) {
                            if(lista.get(j).csapatnev.equals(tomb[0])){
                                lista.get(j).pont += 1;
                                lista.get(j).golok += hazai;
                            }
                        }
                    }
                    
                }
            }
        }
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).csapatnev + ": " + lista.get(i).pont + " points (" + lista.get(i).golok + " scored goals)");
        }
    }
}
class Jegkorong implements Comparable<Jegkorong>{
    public String csapatnev;
    public int pont;
    public int golok;

    public Jegkorong(String csapatnev, int pont, int golok) {
        this.csapatnev = csapatnev;
        this.pont = pont;
        this.golok = golok;
    }

    @Override
    public int compareTo(Jegkorong o) {
        if(this.pont == o.pont){
            if(this.golok == o.golok){
                return this.csapatnev.compareTo(o.csapatnev);
            }
            return o.golok - this.golok;
        }
        return o.pont - this.pont;
    }
}