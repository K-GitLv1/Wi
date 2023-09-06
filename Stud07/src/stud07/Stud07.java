package stud07;

    import java.util.Scanner;
 
public class Stud07 {

    public static void main(String[] args) {
      
        int score[] = new int [5];
        String name[] = new String[5];
        int sum = 0;
        int grade =0;
            Scanner kb = new Scanner(System.in);
               
        for (int i=0; i<score.length; i++){
            System.out.print("press Enter ชื่อนักศึกษา = ");
            name[i] = kb.next();
            System.out.print((i+1)+"\t"+"Press Enter score = ");
            score[i] = kb.nextInt();
            
    }
        
    System.out.println("\n"+"ลำดับที่"+"\t"+"ชื่อนักศึกษา"+"\t"+"คะแนน"+"\t"+"เกรด");
        for (int j=0; j<score.length; j++){
            if (score[j] >= 80){
                grade = 4;
            }else if (score[j] >= 70){
                grade = 3;
            }else if (score[j] >= 60){
                grade = 2;
            }else if (score[j] >= 50){
                grade = 1;
            }else grade = 0;
            
            System.out.println((j+1)+"\t"+name[j]+"\t"+score[j]+"\t"+grade);
            
        }  
        
    }   
    
}
