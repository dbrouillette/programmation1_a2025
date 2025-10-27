package Demo;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Demot15Sept {
    public static void main(String[] args) {

        int choixUtilisateur = 3;

        switch (choixUtilisateur){
            case 1: 
                System.out.println("Lundi!");
                break;
            case 2: 
                System.out.println("Mardi!");
                break;
            case 3: 
                System.out.println("Mercredi!");
                break;
            case 4: 
                System.out.println("Jeudi!");
                break;
            case 5: 
                System.out.println("Vendredi!");
                break;
            case 6: 
                System.out.println("Week-end!");
                break;
            case 7: 
                System.out.println("Week-end!");

            default: 
                System.out.println("Toute valeur possible!");
            
        }



        char lettre = 'a';

        switch(lettre){
            case 'a':
                System.out.println("A!!");
                break;
            case 'b':
                System.out.println("A!!");
                break;

        }






        String mot = "David";

        



        switch(mot){
            case "David":
                System.out.println("Wow!");
                break;
            case "Shany":
                System.out.println("Beurk!");
                break;
        }




    }
}

