package array2miti;

import java.util.Scanner;



public class Array2miti {
    
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int score[] = new int [5];
        int sum = 999;
         
        
        
        for (int i=0; i<score.length; i++){
            System.out.print((i+1)+" Press Entere Score = ");
            score[i] = kb.nextInt();
            sum += score[i];
            
        }
        System.out.println("\n"+" Show Score ");
        for (int j = 0; j<score.length; j++){
            System.out.println((j+1)+" Show Score = "+score[j]);
        }
        System.out.println("\n"+"Show Sum Score in Array = "+sum);
    }
    
}
