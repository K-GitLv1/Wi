package scoreit;

import java.util.Arrays;

public class Scoreit {

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
        
        System.out.println("คะแนนของนักเรียนทั้งหมด 20 คน 3 ครั้ง:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("นักเรียนคนที่ " + (i + 1) + ":" +"\t"+ Arrays.toString(scores[i]));
        }
        
            
    }
    
}
