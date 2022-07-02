public class Ex5_4 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };

        int max = score[0];
        int min = score[0];

        for(int i = 0; i < score.length; i++){
            if(score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        } // end of for

        System.out.println("최대값 : " + max); // 최대값 : 100
        System.out.println("최소값 : " + min); // 최소값 : 33
    }
}
