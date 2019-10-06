package lab7;


import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Which subjects you like the most");
        System.out.println("1. System Analasis and Design.");
        System.out.println("2. Computer Programming.");
        System.out.println("3. Internet Application Programming.");
        System.out.println("Select");
        int Selector = SC.nextInt();

        //Switch-case
        switch (Selector){
            case 1: System.out.println("Sure this subject is very hard.");break;
            case 2: System.out.println("Yes,Computer Programming is very fun.");break;
            case 3: System.out.println("ohhh,you migh expert in programming.");break;
            default: System.out.println("Yes have to enter 1-3");
        } 
    }
}
