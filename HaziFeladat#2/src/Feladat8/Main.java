package Feladat8;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sor;

        while (true) {
            sor = sc.nextLine();
            
            if(sor.equals("vege"))
                break;
            
            if(!(sor.equals("ko")) && !(sor.equals("papir")) && !(sor.equals("ollo")))
                sor = sc.nextLine();
            
            int random = (int)( Math.random()*(2 - 0 + 1) ) + 0;
            String gep = "";
            
            if(random == 0)
                gep = "ko";
            else if(random == 1)
                gep = "papir";
            else if(random == 2)
                gep = "ollo";
            
            System.out.println("A gép választása: " + gep);
            
            if(gep.equals("ko") && sor.equals("papir"))
                System.out.println("A humán nyert!");
            if(gep.equals("ko") && sor.equals("ollo"))
                System.out.println("A gép nyert!");
            
            if(gep.equals("papir") && sor.equals("ollo"))
                System.out.println("A humán nyert!");
            if(gep.equals("papir") && sor.equals("ko"))
                System.out.println("A gép nyert!");
            
            if(gep.equals("ollo") && sor.equals("ko"))
                System.out.println("A humán nyert!");
            if(gep.equals("ollo") && sor.equals("papir"))
                System.out.println("A gép nyert!");
            
            if(gep.equals("ko") && sor.equals("ko"))
                System.out.println("Döntetlen!");
            if(gep.equals("papir") && sor.equals("papir"))
                System.out.println("Döntetlen!");
            if(gep.equals("ollo") && sor.equals("ollo"))
                System.out.println("Döntetlen!");
        }
    }
}
