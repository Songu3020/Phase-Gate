def is_prime(number):
    if number <= 1:
        return False
    for count in range(2, number):
        if number % count == 0:
            return False
    return True

def collect_primes(numbers):
    primes = []
    for num in numbers:
        if is_prime(num):
            primes.append(num)
    return primes


