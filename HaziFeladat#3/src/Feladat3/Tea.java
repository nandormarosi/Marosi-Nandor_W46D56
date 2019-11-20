package Feladat3;

public class Tea implements Rendezheto<Tea>{
    public String nev;
    public int ar;

    public Tea(String nev, int ar) {
        this.nev = nev;
        this.ar = ar;
    }

    @Override
    public boolean egyenlo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean nagyobbMint(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean kisebbMint(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public int compareTo(Tea o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
