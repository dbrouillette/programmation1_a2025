package Demo;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Demot15Sept {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);


        int age = 10;
        String nom = "david";


        boolean a = (age >= 10) || (age >= 30) || (age >= 10);

        if(age >= 10){
            System.out.println("ceci est vrai que son age est >= 10 ");
            if(nom.equals("david")){
                System.out.println("il se nomme david");
            }else{
                System.out.println("Il ne se nomme pas David");
            }
        }else{
            System.out.println("ceci est faux!");
        }
  

        String categorie = "natation";

        final String LIGNE1 = "Nom";


        System.out.printf("%-10s:%n","Nom");
        System.out.printf("%-10s:","Age");


    }
}

