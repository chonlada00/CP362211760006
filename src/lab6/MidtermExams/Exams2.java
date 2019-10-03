package lab6.MidtermExams;

import java.util.Scanner;

public class Exams2 {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
            final double PI = 3.14;
            System.out.println("กรุณากรอกตัวเลขของรัศมี :");
            double r = SC.nextDouble();

            double Area = PI * r*r;
            System.out.println("พื้นที่ฐานของกระบอก: "+ Area);


            double h = 2* PI *r;
            System.out.println("ความสูง: "+h);


            double v = (4/3)*PI*r*r*h;
            System.out.println("ปริมาตรของทรงกระบอก: "+v);

        }
}

