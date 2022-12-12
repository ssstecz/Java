public class RightTriangle {
    public static void main(String[] args) {
        // Get args
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // Check if all args are positive
        boolean x = (a > 0) && (b > 0) && (c > 0);
        // check if a² + b² = c²
        boolean y = (c * c == (a * a + b * b)) || (b * b == (a * a + c * c)) || (a * a == (c * c
                + b * b));
        // check required result
        boolean z = (x && y);
        // Print Required result
        System.out.println(z);
    }
}
