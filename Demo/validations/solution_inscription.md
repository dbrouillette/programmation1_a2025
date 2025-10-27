# ✅ Solutionnaire - Exercice d'inscription sportive en Java

Voici une solution qui utilise des `while` et qui **termine directement
le programme** si une erreur est détectée.

------------------------------------------------------------------------

## 💻 Code Java

``` java
import java.util.Scanner;

public class InscriptionSportive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nom;
        int age;
        double poids;
        String categorie;

        // Nom
        System.out.print("Entrez votre nom complet : ");
        nom = sc.nextLine().trim();
        if (nom.length() < 2) {
            System.out.println("❌ Le nom doit contenir au moins 2 caractères.");
            return;
        }

        // Âge
        System.out.print("Entrez votre âge : ");
        if (!sc.hasNextInt()) {
            System.out.println("❌ L’âge doit être un nombre entier.");
            return;
        }
        age = sc.nextInt();
        if (age < 12 || age > 65) {
            System.out.println("❌ Âge invalide (doit être entre 12 et 65).");
            return;
        }

        // Poids
        System.out.print("Entrez votre poids en kg : ");
        if (!sc.hasNextDouble()) {
            System.out.println("❌ Le poids doit être un nombre (ex : 72.5).");
            return;
        }
        poids = sc.nextDouble();
        if (poids < 30.00 || poids > 200.00) {
            System.out.println("❌ Poids invalide (doit être entre 30.00 et 200.00 kg).");
            return;
        }
        sc.nextLine(); // vider le buffer

        // Catégorie
        System.out.print("Choisissez une catégorie (natation, course, cyclisme) : ");
        categorie = sc.nextLine().trim().toLowerCase();
        if (!categorie.equals("natation") && !categorie.equals("course") && !categorie.equals("cyclisme")) {
            System.out.println("❌ Catégorie invalide.");
        }

        // Détermination de la sous-catégorie par âge
        String ageCategorie;
        if (age <= 17) {
            ageCategorie = "Junior";
        } else if (age <= 40) {
            ageCategorie = "Adulte";
        } else {
            ageCategorie = "Senior";
        }

        // Détermination de la sous-catégorie par poids
        String poidsCategorie;
        if (poids <= 60) {
            poidsCategorie = "Léger";
        } else if (poids <= 90) {
            poidsCategorie = "Moyen";
        } else {
            poidsCategorie = "Lourd";
        }

        // Résumé formaté avec printf
        System.out.println("\n===== Résumé d'inscription =====");
        System.out.printf("Nom        : %s%n", nom);
        System.out.printf("Âge        : %d ans%n", age);
        System.out.printf("Poids      : %.2f kg%n", poids);
        System.out.printf("Catégorie  : %s (%s - %s)%n",
                categorie.substring(0, 1).toUpperCase() + categorie.substring(1),
                ageCategorie, poidsCategorie);

        sc.close();
    }
}
```

------------------------------------------------------------------------

## ⚠️ Points importants

-   Si une donnée est incorrecte → message d'erreur → fin immédiate du
    programme.\
-   Pas de répétition de saisie : **un seul essai par entrée**.\
-   Utilisation de `printf` pour un affichage aligné et clair.
