public class PhaseGateLevel4Test {

public static boolean isEven(int number) {
    return number % 2 == 0;
}

public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
}

public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }

    for (int count = 2; count < number; count++) {
        if (number % count == 0) {
            return false;
        }
    }
    return true;
}

public static int largest(int num1, int num2, int num3) {
    return Math.max(num1, Math.max(num2, num3));
}

public static double simpleInterest(double principal, double rate, double time) {
    return (principal * rate * time) / 100;
}
    }
