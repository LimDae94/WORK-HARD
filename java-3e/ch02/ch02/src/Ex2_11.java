public class Ex2_11 {
    public static void main(String[] args) {
        short sMin = Short.MIN_VALUE;
        short sMax = 32767;
        char cMin = 0;
        char cMax = '\uffff';
        System.out.println("sMin  = " + sMin);
        System.out.println("sMin-1= " + (short)(sMin - 1));
        System.out.println("sMax  = " + sMax);
        System.out.println("sMax+1= " + (short)(sMax + 1));
        System.out.println("cMin  = " + cMin);
        System.out.println("cMin-1= " + --cMin);
        System.out.println("cMax  = " + cMax);
        System.out.println("cMax+1= " + ++cMax);
    }
}
