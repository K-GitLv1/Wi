package sale77;
    import java.util.Scanner;
public class Sale77 {
    public static void main(String[] args) {
        
        int price[] = new int [5];
        String name[] = new String[5];
        int sum = 0;
            Scanner kb = new Scanner(System.in);
               
        for (int i=0; i<price.length; i++){
            System.out.print("press Enter ชื่อสินค้า = ");
            name[i] = kb.next();
            System.out.print("Press Enter ราคา = ");
            price[i] = kb.nextInt();
//            sum += price[i];
                 
    }
        System.out.println("\n"+"สินค้าที่"+"\t"+"ชื่อสินค้า"+"\t"+"ราคา");
        for (int j=0; j<price.length; j++){
            System.out.println((j+1)+"\t"+name[j]+"\t"+price[j]);
        sum += price[j];
        }  
        System.out.println("\n"+"ราคารวมทั้งสิ้น ="+"\t"+sum);
    }   
    
}