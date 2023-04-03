public class Increments {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 0;
        System.out.println("a == " + a + " b == " + b + " c == " + c);
        System.out.println("Postfix: ");
        c = a * b++;
        System.out.println("a == " + a + " b == " + b + " c == " + c);
        c = a * b--;
        System.out.println("a == " + a + " b == " + b + " c == " + c);
        System.out.println("Prefix: ");
        c = a * ++b;
        System.out.println("a == " + a + " b == " + b + " c == " + c);
        c = a * --b;
        System.out.println("a == " + a + " b == " + b + " c == " + c);
    }
}
