/**
 * Вариант 3.
 * Класс: Вектор
 * Члены класса: 3 прямоугольные декартовые координаты
 * Методы: конструктор, метод вывода вектора, метод вычисления длины вектора,
 * сложение (+), скалярное (%) и векторное (*) произведение векторов.
 */
public class Vector {
    private double x, y, z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public double getLength() {
        double result = Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.getZ() * this.getZ());
        return result;
    }

    public Vector sum(Vector vector) {
        Vector res = new Vector(this.getX() + vector.getX(),
                this.getY() + vector.getY(),
                this.getZ() + vector.getZ());
        return res;
    }

    public Vector sub(Vector vector) {
        Vector res = new Vector(this.getX() - vector.getX(),
                this.getY() - vector.getY(),
                this.getZ() - vector.getZ());
        return res;
    }

    public double productScalar(Vector vector) {
        double res = this.getX()*vector.getX() + this.getY()*vector.getY() + this.getZ()*vector.getZ();
        return res;
    }

    public Vector productVector(Vector vector) {
        Vector res = new Vector(this.getY()*vector.getZ() - this.getZ()*vector.getY(),
                this.getZ()*vector.getX() - this.getX()*vector.getZ(),
                this.getX()*vector.getY() - this.getY()*vector.getX());
        return res;
    }

    @Override
    public String toString() {
        return "Vector: " +
                "( " + x +
                ", " + y +
                ", " + z +
                ')';
    }
}
