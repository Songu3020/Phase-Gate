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
