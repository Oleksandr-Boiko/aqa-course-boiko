public class Triangle {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Area of a triangle is: " + s);
    }
}
