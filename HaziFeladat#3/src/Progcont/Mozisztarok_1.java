package Progcont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mozisztarok_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        List<Mozi> lista = new ArrayList<>();

        while ((sor = br.readLine()) != null) {
            String[] tomb = sor.split("[:;]");
            
            String [] valami = tomb[0].split("[()]");            

            boolean filmVan = false;
            for (int i = 1; i < tomb.length; i++) {
                filmVan = false;
                for (int j = 0; j < lista.size(); j++) {
                    if (lista.get(j).filmCim.equals(tomb[i])) {
                        filmVan = true;
                        lista.get(j).belso_lista.add(new Belso(Integer.parseInt(valami[1]), valami[0].trim()));
                    }
                }
                if(filmVan == false){
                    lista.add(new Mozi(tomb[i]));
                    lista.get(lista.size() -1 ).belso_lista.add(new Belso(Integer.parseInt(valami[1]), valami[0].trim()));
                }
            }
        }
        
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++)
            Collections.sort(lista.get(i).belso_lista);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).filmCim);
            for (int j = 0; j < lista.get(i).belso_lista.size(); j++) {
                System.out.println(lista.get(i).belso_lista.get(j).evjarat + ": " + lista.get(i).belso_lista.get(j).szineszNev);
            }
        }
    }
}

class Mozi implements Comparable<Mozi>{

    public String filmCim;
    List<Belso> belso_lista = new ArrayList<>();

    public Mozi(String filmCim) {
        this.filmCim = filmCim;
    }

    @Override
    public int compareTo(Mozi o) {
        if(this.belso_lista.size() == o.belso_lista.size())
            return this.filmCim.compareTo(o.filmCim);
        return o.belso_lista.size() - this.belso_lista.size();
    }
}

class Belso implements Comparable<Belso>{
    public int evjarat;
    public String szineszNev;

    public Belso(int evjarat, String szineszNev) {
        this.evjarat = evjarat;
        this.szineszNev = szineszNev;
    }

    @Override
    public int compareTo(Belso o) {
        if(this.evjarat == o.evjarat)
            return this.szineszNev.compareTo(o.szineszNev);
        return this.evjarat - o.evjarat;
    }
}
