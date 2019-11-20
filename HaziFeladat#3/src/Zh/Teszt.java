package Zh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teszt {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int meret = Integer.parseInt(br.readLine());
        String sor;

        Hallgato[] h = new Hallgato[meret];
        try {
            while (meret > 0) {
                sor = br.readLine();
                String[] tomb = sor.split(" ");

                if (tomb[1].equals("igaz")) {
                    h[meret - 1] = new Hallgato(Integer.parseInt(tomb[0]), true);
                } else {
                    h[meret - 1] = new Hallgato(Integer.parseInt(tomb[0]), false);
                }

                meret--;
            }
            for (int i = h.length - 1; i > -1; i--) {
                boolean megfeleltE = h[i].dolgozatotIr().megfelelt();
                boolean megfeleltE_2 = h[i].dolgozatotIr().megfelelt();

                if (megfeleltE == true && megfeleltE_2 == true) {
                    System.out.println("Megfelelt!");
                } else {
                    System.out.println("Nem megfelelt meg!");
                }
            }
        } catch (Exception e) {
            sor = br.readLine();
        }
    }
}
