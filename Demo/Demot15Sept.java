package Demo;

import java.util.Scanner;

public class Demot15Sept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        if(sc.hasNextInt() == true){
            int nombre = sc.nextInt();
            System.out.println("Vous avez entré : " + nombre);

            // ici 


        }else{
            System.out.println("Hey le gros, tu t'es trompé!");
            System.exit(2);

        }

        sc.close();
    }
}

