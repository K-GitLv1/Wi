package studentlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentlist {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner (System.in);
        ArrayList<String> names =new ArrayList<String>();
//        names.add("Ladda");
//        names.add("Praeploy");
//        names.add("Busarin");
//        names.add("rada");
//        names.add("suchada");
//        System.out.println(names);
//        System.out.println(names.get(0));
//        System.out.println(names.get(4));
        
        System.out.print("Press Enter name = ");
        names.add(kb.nextLine());
        System.out.println(names);
    }
    
}
