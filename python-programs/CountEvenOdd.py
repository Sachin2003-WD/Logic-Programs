def count(arr):
    countEven = 0
    countOdd = 0

    for i in range(len(arr)):
        if(arr[i]%2 == 0):
            countEven+=1
        else:
            countOdd+=1

    return [countEven, countOdd]

def main():
    arr = [1,2,3,4,5,6,7,8,9,10]
    print(count(arr))

main()