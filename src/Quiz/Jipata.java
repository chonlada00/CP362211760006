package Quiz;

import javafx.scene.shape.Circle;
import org.omg.CORBA.portable.ValueOutputStream;

import java.util.Scanner;

public class Jipata {
    private static void Continue() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Do you want to Continue (Y/N): ");
        char c = SC.next().charAt(0);
        if (c == 'Y' || c == 'y') showOption();
        else {
            System.out.println("Good Bye.");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        showOption();
    }

    private static void showOption() {
        Scanner SC = new Scanner(System.in);
        int selector;
        do {
            {
                System.out.println("####Welcome to Jipata System ####");
                System.out.println("Please,select option below:");
                System.out.println("1.Body Mess Index (ฺBMI.");
                System.out.println("2.Geometry capacity.");
                System.out.println("3.Working with Array.");
                System.out.println("4.Exit.");
                System.out.println("Select");
                int Selector = SC.nextInt();
                switch (Selector) {
                    case 1:
                        bmi();
                        break;

                    case 2:
                        capacity();
                        break;

                    case 3:
                        System.out.println("3.");
                        break;
                    case 4:
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Yes have to enter 1-4");
                }
            }
            while (selector < 1 || selector > 4) ;}

        }
    private static  void  Geometrycapacity(){
        Scanner SC = new Scanner(System.in);
        System.out.println("\t1.Circle");
        System.out.println("\t2.Pyramid");
        System.out.println("\tSelect: ");
        int select = SC.nextInt();
        if (select ==1)


    }


    private static void capacity() {
        Scanner in = new Scanner(System.in);
        System.out.println("กรุณากรอกตัวเลขของรัศมี :");
        double r = in.nextDouble();
        double v = (4/3)*3.141*r*r*r;
        System.out.println("ปริมาตรวงกลม: "+v);
    }

    private static void bmi() {
        //BMI = weight/(height*height)
        Scanner in = new Scanner(System.in);

        System.out.print("Weight: ");
        float weight = in.nextFloat();

        System.out.print("Height: ");
        float height = in.nextFloat();

        float bmi = weight * 10000.00f / (height * height);
        System.out.println(bmi);

        in.close();
    }
    }

