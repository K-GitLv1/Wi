package arrayscore001;

public class Arrayscore001 {
    
    public static void main(String[] args) {
        
        int score[] = {10, 20, 30};
        String name[] = {"naruto", "sasuke", "kakashi"};
        System.out.println("Order\tscore\tname\n");   
        
        for(int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "\t" + score[i] + "\t" + name[i]);
            
        }
    }
}


