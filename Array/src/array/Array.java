package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int score[] = new int [5];
        String name [] = new String[5];
        int sum = 0;
        Scanner kb = new Scanner(System.in);
        
        for (int i=0; i<score.length; i++){
            System.out.print(" Press Entere score"+"\t"+"= ");
            score[i] = kb.nextInt();
            System.out.print(" Press Entere name"+"\t"+"= ");
            name[i] = kb.next();
            sum += score[i];
            
        }
        System.out.println("\n"+" Show Score & Name "+"\n");
        System.out.println("order"+"\t"+"score"+"\t"+"Name");
        for (int j = 0; j<score.length; j++){
            System.out.println((j+1)+"\t"+name[j]+"\t"+score[j]);
        }
        System.out.println("\n"+"Show Sum Data in Array = "+sum+"\n");
    }
    
}
