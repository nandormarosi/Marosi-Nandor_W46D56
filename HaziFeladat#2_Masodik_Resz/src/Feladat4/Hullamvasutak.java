package feladat4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Hullamvasutak {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        int szam = Integer.parseInt(br.readLine());
        ArrayList<Vasut> lista = new ArrayList<>();
        
        while(szam > 0){
            sor = br.readLine();
            String [] tomb = sor.split(";");
            lista.add(new Vasut(tomb[0], tomb[1], Integer.parseInt(tomb[2]), Integer.parseInt(tomb[3])));

            szam--;
        }
        Collections.sort(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nev + " (" + lista.get(i).vilagNev + "): " + lista.get(i).varkozasiIdo);
        }
    }    
}
class Vasut implements Comparable<Vasut>{
    public String nev;
    public String vilagNev;
    public int minimum;
    public int varkozasiIdo;

    public Vasut(String nev, String vilagNev, int minimum, int varkozasiIdo) {
        this.nev = nev;
        this.vilagNev = vilagNev;
        this.minimum = minimum;
        this.varkozasiIdo = varkozasiIdo;
    }

    @Override
    public int compareTo(Vasut o) {
        if(this.varkozasiIdo == o.varkozasiIdo){
            if(this.minimum == o.minimum){
                return this.nev.compareTo(o.nev);
            }
            return o.minimum - this.minimum;
        }
        return this.varkozasiIdo - o.varkozasiIdo;
    }    
}