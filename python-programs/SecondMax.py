def find_smax(arr):
    first_max = arr[0]
    second_max = arr[1]
    for i in range(len(arr)):
        if arr[i]>first_max:
            second_max = first_max
            first_max = arr[i]
        elif arr[i]>second_max and arr[i] != first_max:
            second_max = arr[i]
    return second_max

def main():
    arr = [3,5,1,6,9,3,6,10]
    print(find_smax(arr))

main()