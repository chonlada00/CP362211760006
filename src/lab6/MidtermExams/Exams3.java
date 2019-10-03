package lab6.MidtermExams;

import java.util.Scanner;

public class Exams3 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        char gender;
        double h;
        int k, age;
        //input data
        System.out.println("Enter gender: ");
        gender = SC.next().charAt(0);
        System.out.print("Enter high: ");
        h = SC.nextDouble();
        System.out.print("Enter kilogram: ");
        k = SC.nextInt();
        System.out.print("Enter age: ");
        age = SC.nextInt();

        double p_m = 66.5 + (13.75 * k) + (5.003 * h) - (6.775 * age);
        System.out.println(p_m);
    }
}

