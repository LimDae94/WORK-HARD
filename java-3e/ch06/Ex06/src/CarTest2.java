class Car2 {
    String color;		// 색상
    String gearType;	// 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car2() {    // 생성자 1
        this("white", "auto", 4); //Car2(String color, String gearType, int door)를 호출
    }

    Car2(String color) {    // 생성자 2
        this(color, "auto", 4);
    }

    Car2(String color, String gearType) {   // 생성자 3
        this(color, gearType, 4);
    }
    
    // this.color -> 인스턴스변수이고, 
    // color 는 생성자의 매개변수로 정의된 지역변수로 서로 구별이 가능
    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");
        Car2 c3 = new Car2("green", "auto");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
        System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
    }
}