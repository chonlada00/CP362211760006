package lab4;

import java.util.Scanner;

public class ExInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter an integer:");
        int x = scanner.nextInt();
        System.out.println("Your entered integer:"+x);

        System.out.println("Please, enter an integer2:");
        Double b  = scanner.nextDouble();
        System.out.println("Your entered integer+b");

        //input double
        System.out.println("Please, enter an integer:");
        double y = scanner.nextDouble();

        System.out.println("Your entered double: "+y);


        //input Sting
        System.out.println("Please, enter an integer:");
        String s = scanner.nextLine();

        System.out.println("You name is: "+s);







    }
}
