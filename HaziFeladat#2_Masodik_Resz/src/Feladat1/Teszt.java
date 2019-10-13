package Feladat1;

public class Teszt {
    public static Katona megkuzd(Katona elso, Katona masodik){
        Katona nyertes = null;
        
        int ertek_1 = elso.getTamadoEro() - masodik.getVedoEro();
        int ertek_2 = masodik.getTamadoEro() - elso.getVedoEro();
        
        if(ertek_1 > ertek_2 || ertek_1 == ertek_2)
            nyertes = elso;
        else
            nyertes = masodik;
        
        
        return nyertes;        
    }
    public static void main(String[] args) {
        Katona v = new Katona();
        System.out.println(v);
        Nyilas v1 = new Nyilas(5,11,10);
        System.out.println(v1);
        
        System.out.println(v + " vs " + v1 + " Nyertes: " + megkuzd(v, v1));
        
        Katona k1 = new Nyilas(10,10,10);
        Katona k2 = new Nyilas(11, 6, 14);
        Katona k3 = new Landzsas();
        
        System.out.println("A csata nyertese: " + megkuzd(megkuzd(k1, k2), k3));
    }
}
