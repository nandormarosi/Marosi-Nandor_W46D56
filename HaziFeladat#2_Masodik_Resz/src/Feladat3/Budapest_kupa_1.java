package Feladat3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Budapest_kupa_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Tav> lista = new ArrayList<>();
        
        String sor = br.readLine();
        int szam = Integer.parseInt(sor);
        int index = szam;
        int osszeg = 0;
        
        while(szam > 0){
            osszeg = 0;
            sor = br.readLine();
            String [] tomb = sor.split(";");
            
            for (int i = 4; i < tomb.length; i++) 
                osszeg += Integer.parseInt(tomb[i]);
            
            lista.add(new Tav(Integer.parseInt(tomb[0]), Integer.parseInt(tomb[1]), Integer.parseInt(tomb[2]), tomb[3], osszeg));

            szam--;
        }
        Collections.sort(lista);
        
        int max = lista.get(0).tavolsag;
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).tavolsag == max){
                if(lista.get(i).honap < 10 && lista.get(i).nap < 10)
                    System.out.println(lista.get(i).ev + ";0" + lista.get(i).honap + ";0" + lista.get(i).nap + ";" + lista.get(i).nev);
                if(lista.get(i).honap < 10 && lista.get(i).nap >= 10)
                    System.out.println(lista.get(i).ev + ";0" + lista.get(i).honap + ";" + lista.get(i).nap + ";" + lista.get(i).nev);
                if(lista.get(i).honap >= 10 && lista.get(i).nap < 10)
                    System.out.println(lista.get(i).ev + ";" + lista.get(i).honap + ";0" + lista.get(i).nap + ";" + lista.get(i).nev);
                if(lista.get(i).honap >= 10 && lista.get(i).nap >= 10)
                    System.out.println(lista.get(i).ev + ";" + lista.get(i).honap + ";" + lista.get(i).nap + ";" + lista.get(i).nev);                 
            
            }
        }    
    }
}

class Tav implements Comparable<Tav>{
    public int ev;
    public int honap;
    public int nap;
    public String nev;
    public int tavolsag;

    public Tav(int ev, int honap, int nap, String nev, int tavolsag) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.nev = nev;
        this.tavolsag = tavolsag;
    }   

    @Override
    public int compareTo(Tav o) {
        if(this.tavolsag == o.tavolsag){
            if(this.ev == o.ev){
                if(this.honap == o.honap){
                    if(this.nap == o.nap){
                        return this.nev.compareTo(o.nev);
                    }
                    return this.nap - o.nap;
                }
                return this.honap - o.honap;
            }
            return this.ev - o.ev;
        }
        return o.tavolsag - this.tavolsag;
    }
}
