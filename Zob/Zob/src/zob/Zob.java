package zob;
import java.util.Arrays;

public class Zob {

    public static void main(String[] args) {

        int[][] scores = {
            {8, 6, 8},
            {9, 7, 8},
            {8, 7, 8},
            {9, 8, 7},
            {9, 8, 7},
            {8, 8, 7},
            {8, 8, 8},
            {6, 7, 8},
            {6, 8, 8},
            {7, 9, 9},
            {5, 9, 9},
            {7, 7, 9},
            {8, 9, 7},
            {8, 9, 8},
            {8, 8, 8},
            {9, 7, 8},
            {9, 8, 8},
            {7, 9, 8},
            {8, 9, 8},
            {8, 9, 8}
        };

        // แสดงคะแนนของนักเรียนทั้งหมด
        System.out.println("คะแนนของนักเรียนทั้งหมด 3 ครั้ง:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("นักเรียนที่ " + (i + 1) + ":" +"\t"+ Arrays.toString(scores[i]));
        }

        // คำนวณคะแนนเฉลี่ยแต่ละครั้งของทุกคน
        for (int j = 0; j < scores[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i][j];
            }
            double avgScore = sum / scores.length;
            System.out.printf("คะแนนเฉลี่ยของครั้งที่ %d: %.2f\n", (j + 1), avgScore);
        }
    }
}
