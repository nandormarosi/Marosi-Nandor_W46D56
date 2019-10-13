package Feladat4;

import java.util.Arrays;

public class Test {
    public static Teherauto [] rendezMaxSzallithatoTeherCsokkenoleg(Teherauto [] teher){
        int k = 0;
        
        for (int i = 0; i < teher.length; i++) {
            if(teher[i] instanceof Teherauto)
                k++;
        }
        Teherauto [] rendez = new Teherauto[k];
        k = 0;
        for (int i = 0; i < teher.length; i++) {
            if(teher[i] instanceof Teherauto){
                rendez[k] = teher[i];
                k++;
            }                
        }
        for (int i = 0; i < rendez.length; i++) {
            for (int j = i + 1; j < rendez.length; j++) {
                if(rendez[i].getMaxSzallithatoTeher() < rendez[j].getMaxSzallithatoTeher()){
                    Teherauto teh = rendez[i];
                    rendez[i] = rendez[j];
                    rendez[j] = teh;
                }
            }
        }        
        return rendez;
    }
    
    public static Auto keresMaxMotorTeljesitmeny(Auto [] auto){
        Auto talalat = new Auto("", Integer.MIN_VALUE);
        
        for (int i = 0; i < auto.length; i++) {
            if(!(auto[i] instanceof Teherauto)){
                if(auto[i].getMotorTeljesitmeny() > talalat.getMotorTeljesitmeny())
                    talalat = auto[i];
            }
        }
        return talalat;
    }
    
    
    public static void main(String[] args) {
        Auto [] v = new Auto[]{
            new Auto("POC-245", 100),
            new Auto("POC-246", 90),
            new Auto("POC-247", 80),
            new Auto("POC-248", 70),
            new Auto("POC-249", 60),
            
            new Teherauto(40, "ZHB-455", 100),
            new Teherauto(45, "ZHB-456", 110),
            new Teherauto(50, "ZHB-457", 120),
            new Teherauto(60, "ZHB-458", 140),
            new Teherauto(70, "ZHB-459", 150)
        };
        
        Teherauto [] p = new Teherauto[]{
            new Teherauto(400, "ZHB-455", 100),
            new Teherauto(450, "ZHB-456", 110),
            new Teherauto(500, "ZHB-457", 120),
            new Teherauto(600, "ZHB-458", 140),
            new Teherauto(100, "ZHB-459", 150),
            new Teherauto(40, "ZHB-400", 100),
            new Teherauto(45, "ZHB-401", 110),
            new Teherauto(5000, "ZHB-402", 120),
            new Teherauto(234, "ZHB-403", 140),
            new Teherauto(700, "ZHB-404", 150)
        };
        Teherauto [] teherauto = rendezMaxSzallithatoTeherCsokkenoleg(p);
        System.out.println("A rendezett tömb csökkenő sorrendben: " + Arrays.toString(teherauto));
        Auto valami = keresMaxMotorTeljesitmeny(v);
        System.out.println("A legnagyobb teljesítményű autó: " + valami);
    }
}
