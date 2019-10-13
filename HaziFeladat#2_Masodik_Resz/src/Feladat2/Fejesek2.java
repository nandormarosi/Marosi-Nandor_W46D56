package Feladat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fejesek2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Torna> lista = new ArrayList<>();
        String sor;
        
        sor = br.readLine();
        String [] tomb = sor.split(";");
        int szam = Integer.parseInt(tomb[0]);
        int index = szam;
        String elso = tomb[1];
        String keres = tomb[2];
        int piros, kek;
        
        while(szam > 1){
            sor = br.readLine();
            tomb = sor.split(";");
            lista.add(new Torna(tomb[0], tomb[1]));
            
            szam--;
        }
        int hanyadik = 0, szamlalo = 1;
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if(elso.equals(lista.get(j).elotte)){
                    if(keres.equals(lista.get(j).nev))
                        hanyadik = szamlalo;
                    elso = lista.get(j).nev;
                    szamlalo++;
                }                    
            }
        }
        if(hanyadik % 2 != 0){
            piros = (hanyadik + 1) / 2;
            kek = (hanyadik - 1) / 2;
            System.out.println(piros + " " + kek);
        }
        else{
            piros = hanyadik / 2;
            kek = hanyadik / 2;
            System.out.println(piros + " " + kek);
        }
    }    
}
class Torna{
    public String nev;
    public String elotte;

    public Torna(String nev, String elotte) {
        this.nev = nev;
        this.elotte = elotte;
    }    
}
