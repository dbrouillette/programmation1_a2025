package Demo;

import java.util.Random;
import java.util.Scanner;

public class Demot22Sept {
    public static void main(String[] args) {
String[] choix = {"Roche", "Papier", "Ciseaux"};
        Random alea = new Random();

        System.out.println("Choisissez : 0 = Roche, 1 = Papier, 2 = Ciseaux");
        int joueur = 2; // votre choix, à modifier 
        int ordinateur = alea.nextInt(3); // valeur aléatoire

        System.out.println("Vous avez choisi : " + choix[joueur]);
        System.out.println("L'ordinateur a choisi : " + choix[ordinateur]);

        int resultat = (joueur - ordinateur + 3) % 3;

        if (resultat == 0) {
            System.out.println("Égalité !");
        } else if (resultat == 1) {
            System.out.println("Vous gagnez !");
        } else {
            System.out.println("L'ordinateur gagne !");
        }


    }
}
