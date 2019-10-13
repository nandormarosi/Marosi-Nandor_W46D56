package feladat6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Masfel_millio_lepes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Tura> lista = new ArrayList<>();
        int kek = 0, piros = 0, sarga = 0, zold = 0, maradek = 0;
        String sor, nev, karakterek;
        int szam = Integer.parseInt(br.readLine());
        
        while(szam > 0){
            maradek = 0;
            kek = 0;
            sarga = 0;
            piros = 0;
            zold = 0;
            sor = br.readLine();
            String [] tomb = sor.split(";");
            nev = tomb[0];
            karakterek = tomb[1];
            
            for (int i = 0; i < karakterek.length(); i++) {
                if(karakterek.charAt(i) == 'K')
                    kek++;
                if(karakterek.charAt(i) == 'Z')
                    zold++;
                if(karakterek.charAt(i) == 'P')
                    piros++;
                if(karakterek.charAt(i) == 'S')
                    sarga++;
            }
            maradek = zold + piros + sarga;
            lista.add(new Tura(nev, kek, maradek));
            szam--;
        }
        Collections.sort(lista);
        for (Tura tura : lista) {
            System.out.println(tura.nev);
        }        
    }    
}

class Tura implements Comparable<Tura>{
    public String nev;
    public int kek;
    public int maradek;

    public Tura(String nev, int kek, int maradek) {
        this.nev = nev;
        this.kek = kek;
        this.maradek = maradek;
    }    

    @Override
    public int compareTo(Tura o) {
        if(this.kek == o.kek){
            if(this.maradek == o.maradek){
                return this.nev.compareTo(o.nev);
            }
            return o.maradek - this.maradek;            
        }
        return o.kek - this.kek;
    }
}
