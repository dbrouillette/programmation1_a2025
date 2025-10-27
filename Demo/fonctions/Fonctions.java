public class Fonctions {
    public static void main(String[] args) {
        System.out.println("Test");

        for(int i = 0; i <= 1000; i++){
            calculerTableau(i);
        }
    }

    public static void calculerTableau(int taille){
        // définition d'un tableau de x cellules
        int tableau[] = remplirTableau(taille);

        // calculer la somme de ce tableau
        int valeur = somme(tableau);

        System.out.printf("La somme d'un tableau de %d est de %d %n", taille,valeur);
    }
    
    public static int[] remplirTableau(int taille){
        int[] tableau = new int[taille];

        // remplissage du tableau
        for(int i = 0;i<tableau.length;i++){
            // de la valeur de l'index + 1
            tableau[i] = i + 1;
        }

        return tableau;
    }
    
    // somme des nombres d'un tableau
    public static int somme(int[] tableau){
        int valeurSomme = 0;
        for(int i = 0; i< tableau.length;i++){
            valeurSomme = tableau[i] + valeurSomme;
        }

        return valeurSomme;
    }

    // somme de a et b ayant un paramètre d'entré a et un paramètre d'entré b
    public static int somme(int a, int b){
        return a+b;
    }

    // somme de a et b ayant un paramètre d'entré a et un paramètre d'entré b
    public static int somme(int a, int b, int c){
        return somme(a,b) +c;
    }





    public static void afficherLignes() {
        System.out.printf("Partie 1%n");
        System.out.printf("Partie 2%n");
        System.out.printf("Partie 3%n");

    }


}
