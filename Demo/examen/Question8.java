public class Question8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        int resultat = a++ + (--b % 5);
        System.out.println("a = " + ++a);
        System.out.println("b = " + b);
        System.out.println("c = " + c--);
        System.out.println("resultat = " + resultat);

    }
}

