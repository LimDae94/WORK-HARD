class Data2 { int x; }

class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
//        change(d);  // 주소를 매개변수로 넘겨준 것
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) { // 기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}