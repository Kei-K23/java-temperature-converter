import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Java Temperature Converter program");
        System.out.println("Choose one of the following");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (only type one number for example 1 or 2 like that.): ");

        int choice = scanner.nextInt();

        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                result = celsiusToFahrenheit(celsius);
                System.out.println("Temperature in Fahrenheit: " + result);
                break;
            case 2:
                System.out.print("Enter the temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                result = fahrenheitToCelsius(fahrenheit);
                System.out.println("Temperature in celsius: " + result);
                break;
            case 3:
                System.out.print("Enter the temperature in Celsius: ");
                celsius = scanner.nextDouble();
                result = celsiusToKelvin(celsius);
                System.out.println("Temperature in Kelvin: " + result);
                break;
            case 4:
                System.out.print("Enter the temperature in Kelvin: ");
                double kelvin = scanner.nextDouble();
                result = kelvinToCelsius(kelvin);
                System.out.println("Temperature in Celsius: " + result);
                break;
            case 5:
                System.out.print("Enter the temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                result = fahrenheitToKelvin(fahrenheit);
                System.out.println("Temperature in Kelvin: " + result);
                break;
            case 6:
                System.out.print("Enter the temperature in Kelvin: ");
                kelvin = scanner.nextDouble();
                result = kelvinToFahrenheit(kelvin);
                System.out.println("Temperature in Fahrenheit: " + result);
                break;
            default:
                System.out.print("Invalid converter! Please correct number");
                break;
        }
        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }
}