
package HospitalDemo;

import java.util.Scanner;
public class HospitalDemo {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        
        System.out.println("Patient name :");
        String name=input.nextLine();
        System.out.println("Patient Body temparature :");
        double bodytemp=input.nextDouble();
        System.out.println("Patient Duration :");
        int duration=input.nextInt();
         hospital h1=new hospital(name,bodytemp,duration);
         System.out.println("diagonsepatient"+h1.diagonsepatient());
    }
}
