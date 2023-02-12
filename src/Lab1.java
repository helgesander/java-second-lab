import java.util.Scanner;

public class Lab1 {
    public static void main(String []args) {
        Point3d[] points = new Point3d[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d: Введите координаты точки: ", i + 1);
            double xTemp = sc.nextDouble();
            double yTemp = sc.nextDouble();
            double zTemp = sc.nextDouble();
            points[i] = new Point3d(xTemp, yTemp, zTemp);
        }
            if (points[0].equal(points[1]) ||  points[1].equal(points[2])) {
                System.out.println("Координаты равны, повторите попытку! ");
            }
            else {
                double result = computeArea(points[0], points[1], points[2]);
                System.out.printf("Площадь равна: %f\n", result);
            }
    }
    public static double computeArea(Point3d first, Point3d second, Point3d third) {
        // Используем формулу Герона 
        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(first);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
