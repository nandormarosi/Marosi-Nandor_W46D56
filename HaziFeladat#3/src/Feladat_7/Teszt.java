package Feladat_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teszt {
    public static void main(String[] args) {
        List<Lakohaz> lista = new ArrayList<Lakohaz>();
        lista.add(new Lakohaz("Kassai út", 5, 50));
        lista.add(new Lakohaz("Csapó utca", 6, 40));
        lista.add(new Lakohaz("Piac utca", 3, 80));
        lista.add(new Lakohaz("Nádor utca", 2, 70));
        lista.add(new Lakohaz("Nyíl utca", 1, 100));
        lista.add(new Lakohaz("Homok utca", 3, 65));
        lista.add(new Lakohaz("Füredi út", 10, 55));
        lista.add(new Lakohaz("Böszörményi út", 5, 70));
        lista.add(new Lakohaz("Mester utca", 2, 80));
        lista.add(new Lakohaz("István út", 9, 75));
        
        List<Lakohaz> l = tagasLakohazak(lista, 1500);
        Collections.sort(l);
        System.out.println(l);
    }
    public static List<Lakohaz> tagasLakohazak(List<Lakohaz> lista, double terfogat){
        List<Lakohaz> result = new ArrayList<>();
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).legkobmeter() > terfogat)
                result.add(new Lakohaz(lista.get(i).getCim(), lista.get(i).getEmeletSzama(), lista.get(i).getAlapterulet()));
        }
        return result;
    }
}