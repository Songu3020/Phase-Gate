def add_numbers(num1, num2):
    return num1 + num2

def is_even(number):
    return number % 2 == 0

def square(number):
    return number * number

def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32


print(celsius_to_fahrenheit(25))

def is_prime(number):
    if number <= 1:
        return False
    
    for count in range(2, number):
        if number % count == 0:
            return False
    return True

def simple_interest(principal, rate, time):
    return (principal * rate * time) / 100

def multiplication_table(number):
    for count in range(1, 11):
        print(number, "x", count, "=", number * count)

