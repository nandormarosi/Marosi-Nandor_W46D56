package Feladat4;

import java.util.Date;
import java.util.Objects;

public class Ital {

    protected String név;
    protected String kiszerelés;
    private static int ár;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
        //this.ár = 10;
        
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }
       
    public static void setÁr(int ár){
        ár = 10;
    }
    
    @Override
    public String toString() {
        return getNév() + "," + getKiszerelés() + "," + getÁr() + "Ft";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Ital))
            return false;
        
        Ital v = (Ital) obj;
        
        return v.getNév().equals(this.név) && v.getKiszerelés().equals(this.kiszerelés) && v.ár == this.ár;
    }
    public static double getÁrEuróban(double ár){
        double euro;
        
        euro = ár / 335;
        
        return euro;
    }
    
}
