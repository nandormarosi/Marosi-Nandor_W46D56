package Feladat1;

public abstract class Gyumolcsle extends Ital{

    public Gyumolcsle(Gyumolcs gy){
        
    }

    public abstract String mibplKeszult();
    public abstract String milyenIzu();
    public abstract String mibolFacsartak();

    @Override
    public String toString() {
        return "Gyumolcsle{" + '}';
    }   
}
