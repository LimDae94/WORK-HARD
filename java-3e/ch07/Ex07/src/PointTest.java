public class PointTest {
    public static void main(String[] args) {

        System.out.println("=========p1==========");
        Point3D p1 = new Point3D(1, 2, 3);
        System.out.println("x=" + p1.x + ",y=" + p1.y + ",z=" + p1.z);

        Point3D p2 = new Point3D();
        System.out.println("=========p2==========");
        System.out.println("x=" + p2.x + ",y=" + p2.y + ",z=" + p2.z);

    }
}


class Point {
    int x = 10;
    int y = 20;

    Point(int x, int y) {
        // 생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에,
        // 컴파일러가 'super();'를 여기에 삽입합니다.
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z = 30;

    Point3D() {
        this(100, 200, 300);    // Point(int x, int y, int z)를 호출합니다.
    }
    Point3D(int x, int y, int z) {
        super(x, y);    // Point (int x,  int y) 를 호출합니다.
        this.z = z;
    }
}
