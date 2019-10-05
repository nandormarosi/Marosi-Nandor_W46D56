package Feladat2;

public class Teszt {
    public static void main(String[] args) {
        RegularPolygon o1 = new RegularPolygon();
        RegularPolygon o2 = new RegularPolygon(6, 4);
        RegularPolygon o3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println("o1" + o1);
        System.out.println("o2" + o2);
        System.out.println("o3" + o3);        
        
    }
}
