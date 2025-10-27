public class Question2 {
    public static void main(String[] args) {
        int vitesse = 120;
        int charge = 35;
        int temperature = 40;

        if (vitesse > 100 && charge < 40 || temperature > 35) {
            System.out.println("Surcharge critique");
        } else if ((vitesse >= 70 && charge >= 50) && temperature <= 35) {
            System.out.println("Fonctionnement optimal");
        } else {
            System.out.println("Performance réduite");
        }
    }
}
