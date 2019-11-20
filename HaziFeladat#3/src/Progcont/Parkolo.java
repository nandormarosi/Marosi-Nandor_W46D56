package Progcont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parkolo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        List<Auto> lista = new ArrayList<>();
        
        while((sor = br.readLine()) != null){
            String [] tomb = sor.split(";");
            
            lista.add(new Auto(tomb[0], Double.parseDouble(tomb[1]), Integer.parseInt(tomb[2]), Integer.parseInt(tomb[2]) - (tomb.length - 3)));
        }
        Collections.sort(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).szabadhely >= 3)
                System.out.println(lista.get(i).cim + ": " + lista.get(i).szabadhely + " szabad hely");
        }
    }
}
class Auto implements Comparable<Auto>{
    public String cim;
    public double terulet;
    public int ferohely;
    public int szabadhely;

    public Auto(String cim, double terulet, int ferohely, int szabadhely) {
        this.cim = cim;
        this.terulet = terulet;
        this.ferohely = ferohely;
        this.szabadhely = szabadhely;
    }

    @Override
    public int compareTo(Auto o) {
        if(this.szabadhely == o.szabadhely)
            return this.cim.compareTo(o.cim);
        return o.szabadhely - this.szabadhely;
    }  
}