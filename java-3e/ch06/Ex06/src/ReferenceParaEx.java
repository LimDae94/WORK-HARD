class Data { int x; }

class Ex6_8 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

//        change(d.x); 에러 발생! 메서드의 매개변수 타입은 Data2 에요... int   
        change(d);  // 주소를 매개변수로 넘겨준 것
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) { // 참조형 매개변수
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}