def find_max(arr):
    max = arr[0]

    for i in range(len(arr)):
        if arr[i] < max:
            max = arr[i]
    return max

    
def main():
    arr = [1,3,5,2,6,9,0,21,3,5]
    print(find_max(arr))

main()
