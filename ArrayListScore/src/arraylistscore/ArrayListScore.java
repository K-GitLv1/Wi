package arraylistscore;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScore {
    public static void main(String[] args) {

        Scanner kb = new Scanner (System.in);
        ArrayList<Integer> score =new ArrayList<>();
        ArrayList<String> name =new ArrayList<>();
        for (int x=0; x<3;x++){
            System.out.print((x+1)+"  Press Enter Score = ");
            score.add(kb.nextInt());
            System.out.print((x+1)+"  Press Enter Name  = ");
            name.add(kb.next());
//            System.out.println(score.get(x));
            
        }
        System.out.println("\n");
        for (int y=0; y<name.size();y++){
          System.out.println((y+1)+"  Score = "+score.get(y)); 
          System.out.println((y+1)+"  name  = "+name.get(y));
        }
        
    }
    
}
