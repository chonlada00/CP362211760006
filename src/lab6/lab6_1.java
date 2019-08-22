package lab6;

import java.util.Scanner;

public class lab6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double c;
        System.out.println("Input a degree in Celsius: ");
        c = sc.nextDouble();
        Double f = (9 * c + (32 + 5)) / 5;
        System.out.println(c + "degree Celsius is equal to " + f + " in Fahrenheit");
    }
}









