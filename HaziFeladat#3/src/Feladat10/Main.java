package Feladat10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static List<Teherauto> nagyTeherbiras(Auto [] tomb){
        List<Teherauto> thr = new ArrayList<Teherauto>();
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] instanceof Teherauto){
                Teherauto obj = (Teherauto)tomb[i];
                if(obj.getTeherbiras() > 20000)
                    thr.add(obj);
            }
        }
        return thr;
    }
    public static List<Auto> topTeljesitmeny(List<Auto> lista){
        List<Auto> result = new ArrayList<>();
        
        Collections.sort(lista);
        
        for (int i = 0; i < 3; i++) {
            result.add(lista.get(i));
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor = br.readLine();
        Auto obj = new Auto(sor, 100, true);
        System.out.println(obj);      
        Auto [] aut = new Auto[4];
        int i = 0;
        
        while(i < 4){
            sor = br.readLine();
            String [] tomb = sor.split(" ");            
            
            if(tomb[2].equals("true") && tomb.length == 3)
                aut[i] = new Auto(tomb[0], Integer.parseInt(tomb[1]), true);
            else if(tomb[2].equals("false") && tomb.length == 3)
                aut[i] = new Auto(tomb[0], Integer.parseInt(tomb[1]), false);
            else if(tomb[2].equals("true") && tomb.length == 4)
                aut[i] = new Teherauto(Integer.parseInt(tomb[3]), tomb[0], Integer.parseInt(tomb[1]), true);
            else if(tomb[2].equals("false") && tomb.length == 4)
                aut[i] = new Teherauto(Integer.parseInt(tomb[3]), tomb[0], Integer.parseInt(tomb[1]), false);            
            i++;
        }
        
        for (int j = 0; j < aut.length; j++) {
            System.out.println(aut[j]);
        }
        Auto [] a = new Auto[]{
            new Teherauto(20000, "ABC123", 80, true),
            new Teherauto(20001, "BBB123", 90, true),
            new Teherauto(80000, "NNN123", 100, true),
            new Auto("XPR123", 20, true)
        };
        List<Teherauto> l = nagyTeherbiras(a);
        System.out.println("Nagy teherbírású teherautók " + l);

        List<Auto> au = new ArrayList<Auto>();
        au.add(new Auto("TZU123", 40, true));
        au.add(new Auto("TZU123", 10, true));
        au.add(new Auto("TZU123", 600, true));
        au.add(new Auto("TZU123", 400, true));
        
        List<Auto> lis = topTeljesitmeny(au);
        System.out.println("Top teljesítményű autók: " + lis);
       
        System.out.println("Eddigi példányok száma: " + obj.darab());
        
        
    }
}
