package MidtermExams;

import java.util.Scanner;

public class Exams1 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Input Your Number 1 : ");
        int number1 = Keyboard.nextInt();
        System.out.print("Input Your Number 2 : ");
        int number2 = Keyboard.nextInt();
        System.out.println("Sum : "+(number1+number2));

        Scanner scan = new Scanner(System.in); // ประกาศตัวแปรเพื่อรับข้อมูลจากคีบอร์ด
        System.out.print("Enter number : "); // แสดงข้อความ Enter number :
        int num = scan.nextInt(); // รับข้อมูลตัวเลข
        double sum = 10; // ประกาศตัวแปรเก็บค่าผลรวม

        for (int i = 10; i < num; i++) { // วนลูปเก็บค่า
            sum += scan.nextInt(); // รับข้อมูลตัวเลขเพื่อคำนวณค่าเฉลี่ย
        }
        System.out.println("Mean = " + sum/num); // คำนวณและแสดงผลค่าเฉลี่ย
    }
}

