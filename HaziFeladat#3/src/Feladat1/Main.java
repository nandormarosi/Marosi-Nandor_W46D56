package Feladat1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bor [] b = new Bor[]{
            new Bor("Száraz", 10, "Hárslevelű", "Tokaj"),
            new Aszu(5, "Édes", 9, "Aszú", "Tokaji Borvidék"),
            new Bor("Száraz", 10, "Otello", "Eger"),
            new Aszu(5, "Édes", 9, "Aszú", "Tokaj"),
            new Bor("Száraz", 10, "Irsai Olivér", "Badacsony"),
            new Aszu(1, "Édes", 7, "Aszú", "Tokaj-Hegyalja")
        };
        
        Aszu [] a = OtPuttonyos(b);
        System.out.println(Arrays.toString(a));
    }
    
    public static Aszu[] OtPuttonyos(Bor [] bor){
        int seged = 0;
        for (int i = 0; i < bor.length; i++) {
            if(bor[i] instanceof Aszu && bor[i].milyenSzolobolKeszult().equals("Aszú")){
                Aszu obj = (Aszu)bor[i];
                if(obj.hanyPuttonyos() == 5)
                    seged++;
            }
        }
        Aszu [] result = new Aszu[seged];
        seged = 0;
        
        for (int i = 0; i < bor.length; i++) {
            if(bor[i] instanceof Aszu && bor[i].milyenSzolobolKeszult().equals("Aszú")){
                Aszu obj = (Aszu) bor[i];
                if(obj.hanyPuttonyos() == 5){
                    result[seged] = obj;
                    seged++;
                } 
            }
        }
        return result;
    }
}
