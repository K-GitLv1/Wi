package testarray02;
public class Testarray02 {
    public static void main(String[] args) {
        int light[] = {89,99,149,189,199,299,399,489,579,669,649,549};                      
        int sum =0;      
        for(int i = 0; i< light.length; i++){
            sum = sum +light[i];
            System.out.println(i+" "+light[i]+" "+ sum);           
        }
       System.out.println("\n"+ "ค่าไฟฟ้ารวม ="+sum);
    }                                                                                     
}
    /* Codeเดิม
           System.out.println(light[0]);
          System.out.println(light[1]);
          System.out.println(light[2]);
          System.out.println(light[3] + "\n");
          sum = light[0]+light[1]+light[2]+light[3];
          System.out.println(sum);
        */


