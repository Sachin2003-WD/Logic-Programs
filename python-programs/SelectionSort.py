def selection_sort(arr):
    for i in range(len(arr)-1):
        minIdx = i
        for j in range(len(arr)):
            if(arr[j] < arr[minIdx]):
                minIdx = j 

        temp = arr[minIdx]
        arr[minIdx] = arr[i]
        arr[i] = temp

    return arr

def main():
    arr = [3,6,1,5,8,3,8,1,10,4]
    print(selection_sort(arr))

    main()