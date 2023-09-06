package student44;
public class Student44 {
    public static void main(String[] args) {
        
        student obj1 = new student();
        depart  obj2 = new depart();
        phone obj3 = new phone();
        
        for(int x=0; x<obj1.score.length; x++){
            System.out.println(obj1.score[x]+"\t"+obj2.depart[x]+"\t"+obj3.phone[x]);
        }
    }
    
}