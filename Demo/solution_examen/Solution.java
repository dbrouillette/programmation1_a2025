import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Entrez votre nom : ");
        // String nom = sc.nextLine();

        // if (nom.isEmpty()) {
        // System.out.println("Erreur : le nom ne peut pas être vide !");
        // } else {
        // System.out.println("Bonjour, " + nom + " !");
        // }

        final int NB_SAISON = 5;
        int compteur = 1;
        int pointageTotal = 0;
        int maxPointage = 0;
        int pointage = 0;

        do {
            System.out.print("Entrez votre pointage pour la saison %d: ", compteur);
            if (sc.hasNextInt()) {
                pointage = sc.nextInt();
                System.out.printf("Votre pointage est %d pour la saison %d %n",pointage, compteur);
                pointageTotal = pointageTotal + pointage;
            } else {
                System.out.println("Erreur : vous devez entrer un entier !");
            }


            // si le pointage est plus grand que le max de points
            if(pointage > maxPointage){
                maxPointage = pointage;
            }


            compteur++;
        } while (compteur <= NB_SAISON);

        double moyennePoints = (double)pointageTotal / NB_SAISON;

        System.out.printf("Le pointage total est de %d %n", pointageTotal);
        System.out.printf("Le pointage max est de %d %n", maxPointage);
        System.out.printf("La moyenne est de  |%-25f| %n", moyennePoints);

        sc.close();
    }
}
