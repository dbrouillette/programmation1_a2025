public class Question5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 4;

        a += b++ * (c + 3) - 2;

        System.out.printf("%d",b);
    }
}
