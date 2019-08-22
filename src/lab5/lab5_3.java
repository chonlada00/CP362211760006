package lab5;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class lab5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        long hr,minute,seconds;
        System.out.println("Enter second:");
        long input_second = sc.nextInt();

        day = (int) TimeUnit.SECONDS.toDays(input_second);
        hr = TimeUnit.SECONDS.toHours(input_second)-(day*24);
        minute = TimeUnit.SECONDS.toMinutes(input_second)-
                (TimeUnit.SECONDS.toHours(input_second)*60);
        seconds = TimeUnit.SECONDS.toSeconds(input_second)-
                (TimeUnit.SECONDS.toMinutes(input_second)*60);
        System.out.println("Day: "+day);
        System.out.println("Hour: "+hr);
        System.out.println("Minute: "+minute);
        System.out.println("Seconds: "+seconds);


    }

}
