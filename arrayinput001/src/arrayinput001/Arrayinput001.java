package arrayinput001;
import java.util.Scanner;
public class Arrayinput001 {
    public static void main(String[] args) {
           int score[]=new int [2];
           String name[] =new String [2];
           int sum = 0;
           Scanner kb = new Scanner(System.in);
           
           for (int i=0; i< score.length; i++){
               System.out.print("Press Enter Name = ");
               name[i] = kb.next();
               System.out.print("Press Enter score = ");
               score[i] = kb.nextInt();
           }

           //---------display data------------
           for (int j=0; j < score.length; j++ ){
               System.out.println((j+1)+" "+name[j]+" "+score[j]);
               sum +=score[j];
           }
           System.out.println("show data ="+sum);

           }
    } 