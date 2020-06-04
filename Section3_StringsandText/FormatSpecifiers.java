package Section3_StringsandText;

public class FormatSpecifiers {
    public static void main(String[] args) {

        double fahrenheit = 91;
        double celsius = (fahrenheit - 32) * 5 / 9.0;

        System.out.println(fahrenheit + " degree fahrenheit is " + celsius + "degree celsius.");

        System.out.printf("%.1f degree fahrenheit is %.1f degree celsius.\n", fahrenheit, celsius);


        double value = 1.23489508234893;
        System.out.printf("Hello %.2f\n", value);
        System.out.printf("Hello %d\n", 123);
        System.out.printf("%s %d\n", "Hello", 123);
        System.out.printf("%.1f %d\n", 234.23, 780);


    }
}
