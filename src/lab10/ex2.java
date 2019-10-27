package lab10;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        //max
        int max = Max(10,20);
        System.out.println("ค่ามากที่สุดคือ : "+max);
        //min
        System.out.println("ค่าน้อยที่สุดคือ : "+Min(20,15));
        //Multiple
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter an integer 1 :");
        int num1 = SC.nextInt();
        System.out.println("Enter an integer 2 :");
        int num2 = SC.nextInt();

        int mul =Multiple(num1,num2);
        System.out.println("The multipl value is :"+ mul);

    }
    private static int Max(int x, int y) {
        int rs;
        if (x >y)
            rs =x;
        else
            rs=y;
        return rs;
    }//Max
    private   static  int Min(int x,int y){
        int rs;
        if (x<y)
            rs =x;
        else
            rs=y;
        return rs;
    }//Min
    private static int Multiple(int num1,int num2){
        return num1*num2;


    }//Multiple
}
