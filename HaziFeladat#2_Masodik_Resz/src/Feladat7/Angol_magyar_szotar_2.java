package feladat7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Angol_magyar_szotar_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Szotar> lista = new ArrayList<>();
        String sor;
        int szam = Integer.parseInt(sor = br.readLine());
        
        while(szam > 0){
            lista.add(new Szotar(sor = br.readLine()));
            szam--;
        }
        Collections.sort(lista);
        for (Szotar szotar : lista) {
            System.out.println(szotar.szavak);
        }
    }    
}
class Szotar implements Comparable<Szotar>{
    public String szavak;

    public Szotar(String szavak) {
        this.szavak = szavak;
    }
    @Override
    public int compareTo(Szotar o) {
        return this.szavak.compareTo(o.szavak);
    }    
}