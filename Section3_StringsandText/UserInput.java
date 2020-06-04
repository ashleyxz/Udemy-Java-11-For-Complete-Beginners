package Section3_StringsandText;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(Sysyem.in);

        double fahrenheit = 91;

        double celsius = (fahrenheit - 32) * 5 / 9.0;

        System.out.printf("%.1f degree fahrenheit is %.1f degree celsius.\n", fahrenheit, celsius);

    }
}
