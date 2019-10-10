package lab8;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int num[] = new int[5];

        //input
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter an integer[" + (i + 1) + "]:");
            num[i] = SC.nextInt();

        }//for
        System.out.print("data in array");
        for (int i : num) {
            System.out.print(i + " ");
        }

        //find maximum
        int max = num [0];
        for (int i:num) {
            if (max <i)
                max =i;
        }
        System.out.println("The naximum number: "+max);

        //find minimum
        int mini = num [0];
        for (int i:num) {
            if (mini >i)
                mini =i;
        }
        System.out.println("The minimum number: "+mini);

        //find averge
        int total =0;
        for (int i:num) {
            total += i;
        }
        System.out.println("The averge number:"+(total/num.length));
        }
    }

