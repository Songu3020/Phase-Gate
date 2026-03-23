def count_even_numbers(numbers):
    count = 0
    for number in range(len(numbers)):
        if number % 2 == 0:
           count += 1

    return count

def linear_Search(numbers, target):
    for count in range(len(numbers)):
        if numbers[count]== target:
            return count
    return -1
        
