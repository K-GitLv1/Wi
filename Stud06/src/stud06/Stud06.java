package stud06;

public class Stud06 {


    public static void main(String[] args) {

        int score[] = {20,10,30,10,40,10,20,10,20,30};
        int sum = 0;
        
        System.out.println("index Data"+"\n");
        for (int i=0; i < score.length; i++ ){
            System.out.println(i+"  "+score[i]);
            sum += score[i];
    }
        System.out.println("\n"+"Sum Data"+sum+"\n"+"\n"+"\n"+"\n");
    
}
}

//นี่คือ อาเรย์แบบ ใส่ข้อมูลไว้แล้วที่หลังบ้าน