package Feladat6;

public class Main {
    public static boolean isConsecutiveFour(int [] values){
        if(values.length < 4) return false;
        
        int count = 0;
        
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if(values[i] == values[j]){
                    count++;
                    if(count == 4)
                        return true;                                
                }
                else
                    count = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] tomb = {1, 1, 1, 1, 0};
        int [] tomb1 = {0};
        int [] tomb2 = {1, 1, 2, 2, 2, 2, 5, 2, 4, 3};
        
        System.out.println(isConsecutiveFour(tomb));
        System.out.println(isConsecutiveFour(tomb1));
        System.out.println(isConsecutiveFour(tomb2));
    }    
}
