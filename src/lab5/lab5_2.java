package lab5;

import java.util.Scanner;

public class lab5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("กรุณากรอกตัวเลขของรัศมี :");
        double r = scan.nextDouble();

        double Area = PI * r*r;
        System.out.println("พื้นที่ผิวของวงกลม: "+ Area);


        double c = 2* PI *r;
        System.out.println("เส้นรอบวงกลม: "+c);


        double v = (4/3)*PI*r*r*r;
        System.out.println("ปริมาตรวงกลม: "+v);

    }

}
