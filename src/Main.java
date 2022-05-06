
import java.util.Scanner;

public class Main {

    public static void clock(int n){

        String isClock, correctH, correctM, correctS;
        if (n >= 86400) {
            isClock = "23:59:59";
            System.out.println(isClock);
            return;
        }

        n %= 24 * 3600;

        int h = n / 3600;

        n %= 3600;

        int m = n / 60;

        n %= 60;

        int s = n;


        correctH = h >= 10 ? Integer.toString(h) : "0" + h;
        correctM = m >= 10 ? Integer.toString(m) : "0" + m;
        correctS = s >= 10 ? Integer.toString(s) : "0" + s;

        isClock = correctH + ":" + correctM + ":" + correctS;

        System.out.println(isClock);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number of seconds: ");

        int sec = scanner.nextInt();

        clock(sec);

    }
}