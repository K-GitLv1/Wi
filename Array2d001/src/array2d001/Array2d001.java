
package array2d001;


public class Array2d001 {


    public static void main(String[] args) {
        
        int[][] score = {{10,20,30},{20,30,40},{30,40,50}};
//        System.out.println(score[0][0]);
//        System.out.println(score[0][1]);
//        System.out.println(score[0][2]);
//        System.out.println(score[1][0]);
//        System.out.println(score[1][1]);
//        System.out.println(score[1][2]);
//        System.out.println(score[2][0]);
//        System.out.println(score[2][1]);
//        System.out.println(score[2][2]);
        for (int i = 0; i < score.length; i++){
            for (int j = 0; j < score.length; j++){
            System.out.print(score[i][j]);
        }
            System.out.println();
        }
    
    }
}