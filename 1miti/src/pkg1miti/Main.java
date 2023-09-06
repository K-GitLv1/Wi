package pkg1miti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int data[] = new int [5];
        int sum = 0;
        
        for (int i=0; i<data.length; i++){
            System.out.print((i+1)+" Press Entere data = ");
            data[i] = kb.nextInt();
            sum += data[i];
            
        }
        System.out.println("\n"+" Show Data ");
        for (int j = 0; j<data.length; j++){
            System.out.println((j+1)+" Show Data = "+data[j]);
        }
        System.out.println("\n"+"Show Sum Data in Array = "+sum);
        
    }
    
}
