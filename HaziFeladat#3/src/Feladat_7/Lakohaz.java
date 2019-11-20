package Feladat_7;

public class Lakohaz implements Comparable<Lakohaz>{
    public static final double emeletMagassag = 3.2;
    private String cim;
    private int emeletSzama;
    private double alapterulet;

    public Lakohaz(String cim, int emeletSzama, double alapterulet) {
        this.cim = cim;
        this.emeletSzama = emeletSzama;
        this.alapterulet = alapterulet;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletSzama() {
        return emeletSzama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }
    
    public double legkobmeter(){
        double result;
        result = this.alapterulet * emeletMagassag * this.emeletSzama;
        return result;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(emeletMagassag);sb.append(" ");sb.append(cim);sb.append(" ");sb.append(emeletSzama);sb.append(" ")
        ;sb.append(alapterulet);sb.append(" ");sb.append(legkobmeter());
         return sb.toString();
    }

    @Override
    public int compareTo(Lakohaz o) {
        return Double.compare(o.legkobmeter(), this.legkobmeter());
    }
}
