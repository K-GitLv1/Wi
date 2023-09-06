package array2d002;


public class Array2d002 {


    public static void main(String[] args) {
        int salary [][]= {{100,200},{300,400}};
        
        System.out.println(salary[0][0]+" "+salary[0][1]+" "+salary[1][0]+" "+salary[0][1]);
        
        for (int i = 0; i<salary.length; i++){
            for (int j = 0; j<salary.length; j++){
                System.out.print(salary[i][j]);
        
            }
            System.out.println();
        }
        
    }
    
}
