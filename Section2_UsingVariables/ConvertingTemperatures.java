package Section2_UsingVariables;

public class ConvertingTemperatures {
    public static void main(String[] args) {

        double fahrenheit = 91;
        double celsius = (fahrenheit - 32) * 5 / 9.0;

        System.out.println(fahrenheit + " degree fahrenheit is " + celsius + " degree celsius.");
        System.out.printf(fahrenheit + " degree fahrenheit is %f degree celsius.\n");

        System.out.printf("degree fahrenheit is %.2f", celsius\n);


        

/*        double value = 1.23947836;
        System.out.printf("Hello %.2f\n", value);
        System.out.print("Hello\n");
        System.out.printf("Hello %d\n", 123);
        System.out.printf("%s %d\n", "Hello", 123);*/
    }
}
