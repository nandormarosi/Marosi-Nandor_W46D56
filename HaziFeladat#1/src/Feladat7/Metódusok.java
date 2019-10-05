package Feladat7;
import java.util.Arrays;

public class Metódusok {
    public static void main(String[] args) {
        rendez_1(10, 1, 35);
        min_max_2(10.234, -9.56, 0.34);
        kiir_3(1.32, -34.55, 1, -6.44);
        System.out.println(haromszog_4(1, 2, 3));
        szokoev_5(1990, 2019);
        jegy_6(5);
        hanyados_7(16, 2);
        System.out.println(prim_8_1(3));
        System.out.println(prim_8_2(4));
        fibonacci_9_1(5);
        fibonacci_9_2(5);
        horner_10(9876);
        faktorialis_11(12);
        oszthato_12(5, 10, 2);
        min_fibonacci_13(55);
        kob_14();
    }
    
    public static void rendez_1(int elso, int masodik, int haramdik){
        int [] tomb = new int[3];
        tomb[0] = elso;
        tomb[1] = masodik;
        tomb[2] = haramdik;
        
        Arrays.sort(tomb);        
        
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
            
    }
    
    public static void min_max_2(double elso, double masodik, double harmadik){
        double [] tomb = new double[3];
        tomb[0] = elso;
        tomb[1] = masodik;
        tomb[2] = harmadik;
        
        double minimum = Double.MAX_VALUE;
        double maximum = Double.MIN_VALUE;
        
        for (int i = 0; i < tomb.length; i++) {
            if(minimum > tomb[i]){
                minimum = tomb[i];
            }
            if(Math.abs(tomb[i]) > maximum){
                maximum = Math.abs(tomb[i]);
            }
        }
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);        
    }
    
    public static void kiir_3(double a, double b, double c, double d){
        System.out.println(a + " " + b + " " + c + " " + d);
        
        if(d >= 0)
            System.out.println(a + " " + c + " " + b + " " + d);
        else
            System.out.println(a + " " + b + " " + d + " " + c);
    }
    
    public static boolean haromszog_4(double a, double b, double c){
        if(a <= 0 || b <= 0 || c <= 0)
            return false;
        
        if(a + b <= c || a + c <= b || c + b <= a)
            return false;
        
        return true;
    }
    
    public static void szokoev_5(int a, int b){
        int count = 0;
        
        for (int i = a + 1; i < b; i++) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
                count++;
        }        
        System.out.println("A szökőévek száma: " + count);
    }
    
    public static void jegy_6(int a){
        switch (a){
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 5:
                System.out.println("Jeles");
                break;
        }
    }
    
    public static void hanyados_7(int a, int b){
        int hanyados = 0;
        
        while(a >= b){
            hanyados++;
            a = a - b;
        }
        System.out.println(hanyados);
    }
    
    public static boolean  prim_8_1(int a){
        int osztok_szama = 0;
        
        for (int i = 1; i <= a; i++) {
            if(a % i == 0)
                osztok_szama++;
        }
        
        if(osztok_szama == 2 || a == 1)
            return true;
        else
            return false;
    }
    
    public static boolean prim_8_2(int a){
        
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0)
                return false;
        }
        return true;
    }
    
    public static void fibonacci_9_1(int n){
        int a = 0;
        int b = 1;
        int c;
        int k;
        
        if(n == 1)
            System.out.println(a);
        else{
            if(n == 2)
                System.out.println(a + " " + b);
            else{
                c = a + b;
                System.out.print(a + " " + b + " " + c);
                k = 3;
                
                while(k < n){
                    a = b;
                    b = c;
                    c = a + b;
                    
                    System.out.print(" " + c);
                    k++;
                }
                System.out.println("");
            }            
        }
    }
    
    public static void fibonacci_9_2(int n){
        int a = 0;
        int b = 1;
        
        System.out.print(a);
        
        for (int i = 1; i < n; i++) {
            System.out.print(" " + b);
            b = a + b;
            a = b - a;
        }
        System.out.println("");
    }
    
    public static void horner_10(int n){
        
        if(n > 0 && n < 100000000){
            int uj_szam = 0;
        
            while(n != 0){
                uj_szam = uj_szam * 10 + (n % 10);
                n = n / 10;
            }
            System.out.println(uj_szam);
        }
        else{
            System.err.println("A számjegyeknek a száma nem megfelelő!");
        }
    }
    
    public static void faktorialis_11(int a){
        int szam;
        szam = 1;
        
        for (int i = a; i > 0; i--) {
            szam = szam * i;
        }
        
        System.out.println(szam);
    }
    
    public static void oszthato_12(int a, int b, int k){
        int count;
        count = 0;
        
        for (int i = a + 1; i < b; i++) {
            if(i % k == 0)
                count++;
        }
        System.out.println(count);
    } 
    
    public static void min_fibonacci_13(int n){
        int a, b;
        a = 1;
        b = 0;
        
        while(b <= n){
            b = a + b;
            a = b - a;
        }
        System.out.println(b);
    }
    
    public static void kob_14(){
        String sztring;
        double eredmeny;
        eredmeny = 0;
        
        for (int i = 0; i < 1000; i++) {
            sztring = String.valueOf(i);
            
            for (int j = 0; j < sztring.length(); j++){
                eredmeny += Math.pow(Character.getNumericValue(sztring.charAt(j)), 3);                
            }

            if(eredmeny == i)
                System.out.println("Megfejtés: " + i);            
        }
    }
}
