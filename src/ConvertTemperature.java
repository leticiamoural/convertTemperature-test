import java.util.Scanner;

public class ConvertTemperature {

    public static void main(String[] args) {

        boolean endMenu = true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Choose between (1),(2) or (3):");
            System.out.println("Celsius to Fahrenheit (1)");
            System.out.println("Fahrenheit to Celsius (2)");
            System.out.println("Get out (3)");
            int result = input.nextInt();
            double fahrenheit;
            double celsius;


            switch (result) {

                case 1:
                    Scanner inputTemperature =new Scanner(System.in);
                    System.out.println("Enter the temperature in Celsius:");
                    celsius = inputTemperature.nextDouble();
                    fahrenheit = getFahrenheit(celsius);
                    System.out.println("The temperature in Fahrenheit is: " + fahrenheit +"ªF");
                    endMenu = false;
                    break;
                case 2:
                    Scanner inputTemperature2 =new Scanner(System.in);
                    System.out.println("Enter the temperature in Fahrenheit:");
                    fahrenheit = inputTemperature2.nextDouble();
                    celsius = (fahrenheit - 32) * 5.0/9.0;
                    System.out.println("The temperature in Celsius is: " + celsius +"ªC");
                    endMenu = false;
                    break;
                case 3:
                    System.out.println("See you later!");
                    endMenu = false;
                    break;
                default:
                    System.out.println("Invalid option!");
                    endMenu = true;

            }
        }while (endMenu);


    }

    private static double getFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = (9.0/5.0 * celsius) + 32;
        return fahrenheit;
    }
}
