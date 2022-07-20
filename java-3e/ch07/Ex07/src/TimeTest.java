public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(13, 35, 30);
        System.out.println(t);
//        t.hour = 13;  // 에러! 변수 hour 접근 제어자가 private 이므로 접근할 수 없다.
        t.setHour(t.getHour() + 1);
        System.out.println(t);


    }
}

class Time {    // 시간 클래스
    private int hour, minute, second;   // 시, 분, 초 저장할 private 변수

    Time(int hour, int minute, int second) {    // 생성자 선언(매개변수 3개 안넣으면 오류 뜨겠죠?)
        setHour(hour);  // setHour 메서드에 hour 매개변수 전달
        setMinute(minute);  // setMinute 메서드에 minute 매개변수 전달
        setSecond(second);  // setSecond 메서드에 second 매개변수 전달
    }

    public int getHour() { return hour; }   // 바로 hour 반환 -> 생성자와 함께 입력한 default 값
    public void setHour(int hour) {
        if (hour < 0 || hour >23 ) return;  // 예외 : 0-23 벗어나면, 0(default) 반환
        this.hour = hour;   // 생성자로부터 받은 hour 매개변수 값을 클래스 내에 선언된 시 private 변수에 저장
    }

    public int getMinute() { return minute; }   // 바로 minute 반환 -> 생성자와 함께 입력한 default 값
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59 ) return; // 예외 : 0-59 벗어나면, 0(default) 반환
        this.minute = minute;   // 생성자로부터 받은 minute 매개변수 값을 클래스 내에 선언된 시 private 변수에 저장
    }

    public int getSecond() { return second; }   // 바로 second 반환 -> 생성자와 함께 입력한 default 값
    public void setSecond(int second) {
        if ( second < 0 || second > 59) return; // 예외 : 0-59 벗어나면, 0(default) 반환
        this.second = second;   // 생성자로부터 받은 second 매개변수 값을 클래스 내에 선언된 시 private 변수에 저장
    }

    public String toString() {  // 생성자로 생성한 매개변수 출력하면 얘가 출력되는 것 입니다.
        return hour + ":" + minute + ":" + second;
    }
}
