import javafx.beans.binding.ObjectExpression;

class Circle implements Cloneable {
    Point P;    // 원점
    double r;   // 반지름

    Circle(Point P, double r) {
        this.P = P;
        this.r = r;
    }

    public Circle shallowCopy() {   // 얕은 복사
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return (Circle) obj;
    }

    public Circle deepCopy() {  // 깊은 복사
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }

        Circle c = (Circle) obj;
        c.P = new Point(this.P.x, this.P.y);

        return c;
    }

    public String toString() {
        return "[p=" + P + ", r=" + r + "]";
    }
}

class Point2 {
    int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1="+c1);
        System.out.println("c2="+c3);
        System.out.println("c2="+c3);

        c1.P.x = 9;
        c1.P.y = 9;

        System.out.println("= c1의 변경 후 =");
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);


    }
}
