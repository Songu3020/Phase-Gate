def is_prime(number):
    if number <= 1:
        return False
    
    for count in range(2, number):
        if number % count == 0:
            return False
    return True

# Example
#print(is_prime(7))  # True
