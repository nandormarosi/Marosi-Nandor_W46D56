package Zh;

import java.util.Random;

public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }
    
    public Dolgozat dolgozatotIr(){
        int rnd = 0;
        
        if(this.sokatTanul == true && this.mennyitKeszult != -1){
            rnd = (int)( Math.random()*(6 - 5 + 1)) + 5;
            rnd *= this.mennyitKeszult;
        }
        else if(this.sokatTanul == false && this.mennyitKeszult != -1){
            rnd = (int)( Math.random()*(4 - 1 + 1)) + 1;
            rnd *= mennyitKeszult;
        }
        else if(this.mennyitKeszult == -1)
            rnd = -1;
        Dolgozat obj = new Dolgozat(rnd);
        
        return obj; 
    }
}
