package Feladat2;

import java.util.Arrays;
import java.util.Collections;

public class Dolgozat{
    public static SzeszesItal [] topAlkohol(SzeszesItal [] tomb){
        boolean kevesTag = false;
        if(tomb.length < 3)
            return null;
        
        SzeszesItal [] eredmeny = new SzeszesItal[3];

        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb.length; j++) {
                if(tomb[i].getAlkoholTartalom() > tomb[j].getAlkoholTartalom()){
                    SzeszesItal tmp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = tmp;
                }
            }
        }
        eredmeny[0] = tomb[0];
        eredmeny[1] = tomb[1];
        eredmeny[2] = tomb[2];
  
        return eredmeny;        
    }
    
    public static void main(String[] args) {
        SzeszesItal [] sz = new SzeszesItal[]{
            new SzeszesItal(7, "Pezsgő", "0,75 l", 1000),
            new SzeszesItal(5, "Sör", "0,5 l", 300),
            new SzeszesItal(40, "Whiskey", "0,5 l", 5000),
            new SzeszesItal(50, "Pálinka", "0,5 l", 6000),
            new SzeszesItal(30, "Likőr", "0,5 l", 3000),
            new SzeszesItal(45, "Konyak", "0,5 l", 8000)
        };
        
        SzeszesItal [] result = topAlkohol(sz);

        System.out.println(Arrays.toString(result));
    }
}
