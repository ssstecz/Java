public class GreatCircle {
    public static void main(String[] args) {
        // Get Args
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        // Convert coordinates to radians
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        // Calculate Distance
        double p1 = (Math.sin((x2 - x1) / 2));
        double p2 = (Math.sin((y2 - y1) / 2));
        double y = Math.sqrt((p1 * p1) + Math.cos(x1) * (Math.cos(x2) * (p2 * p2)));
        double x = 2 * 6371.0 * Math.asin(y);
        // Print Result
        System.out.println(x + " kilometers");
    }
}
