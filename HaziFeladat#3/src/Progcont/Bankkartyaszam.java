package Progcont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bankkartyaszam {
    public static void main(String[] args) throws IOException {
        String sor;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] result = new int [16];
        
        while((sor = br.readLine()) != null){
            if(sor.equals("0")) break;
            for (int i = sor.length() - 1; i >= 0; i--) {
                if(i % 2 == 0){
                    int szam = 0;
                    if((Character.getNumericValue(sor.charAt(i))) * 2 > 9){
                        szam = Character.getNumericValue(sor.charAt(i)) * 2;
                        String eredmeny = String.valueOf(szam);
                        int elso = 0;
                        int masodik = 0;
                        
                        elso = Character.getNumericValue(eredmeny.charAt(0));
                        masodik = Character.getNumericValue(eredmeny.charAt(1));
                        result[i] = elso + masodik;
                    }
                    else
                        result[i] = szam = Character.getNumericValue(sor.charAt(i)) * 2;                    
                }
                else if(i % 2 != 0)
                    result[i] = Character.getNumericValue(sor.charAt(i));                
            }
            int seged = 0;
            for (int i = 0; i < result.length; i++) 
                seged += result[i];
            
            if(seged % 10 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }        
    }
}
