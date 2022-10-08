/**
 * Вариант 3.
 * Класс: Вектор
 * Исходные данные:
 * a={ax,ay,az}
 * b={bx,by,bz}
 * c={cx,cy,cz}
 * Результаты:
 * r = (a+b)%c
 * t = (a+c)*c
 * Найти длины исходных и результирующего векторов
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("INITIAL VECTORS:");
        Vector a = new Vector(1,2,3);
        Vector b = new Vector(1.25,2.10,-2);
        Vector c = new Vector(-1,5,0.25);
        System.out.println(a + "\n" + b + "\n" + c);

        System.out.println("\nVECTOR a LENGTH: " + a.getLength());
        System.out.println("VECTOR b LENGTH: " + b.getLength());
        System.out.println("VECTOR c LENGTH: " + c.getLength());

        double r = (a.sum(b)).productScalar(c);
        System.out.println("\nTHE RESULT OF r=(a+b)%c: " + r);

        Vector t = (a.sum(c)).productVector(c);
        System.out.println("\nTHE RESULT OF t=(a+c)*c: \n" + t);
        System.out.println("\nTHE LENGTH OF THIS VECTOR: " + t.getLength());
    }
}
