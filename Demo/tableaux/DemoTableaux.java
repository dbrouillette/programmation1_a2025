public class DemoTableaux {
    public static void main(String[] args) {
        int[] valeurs = {1,2,3};
        System.out.println("Avant:");
        for(int valeur : valeurs){
            System.out.println(valeur);
        }

        int vielle_valeur = valeurs[0];
        valeurs[0] = valeurs[1];
        valeurs[1] = vielle_valeur;


        System.out.println("Après:");
        for(int valeur : valeurs){
            System.out.println(valeur);
        }


    }
}
