package polishnotation;
import java.util.Scanner;


public class PolishNotation {

    
    public static void main(String[] args) {
        
       

        String input;

        Scanner inputKlavye = new Scanner(System.in);
        System.out.print("İfade giriniz: ");
        input = inputKlavye.nextLine();
        
        
        polish ifade = new polish(input);
        ifade.IfadeHesapla();
        
        

        
        
    }
    
}

