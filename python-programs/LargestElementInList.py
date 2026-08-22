numbers = [2,3,5,6,87,11,45,99]

largest = numbers[0]

for num in numbers:
    if num > largest:
        largest = num
print(largest)