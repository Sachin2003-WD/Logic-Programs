numbers = [1,4,2,6,66,2,56,9,7]
largest = numbers[0]
second = numbers[1]

for num in numbers:
    if num > largest:
        second = largest
        largest = num
    elif num > second and num != largest:
        second = num

print(second)