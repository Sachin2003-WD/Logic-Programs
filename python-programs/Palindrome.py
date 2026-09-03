def palindrome_arr(arr):
    i = 0
    j = len(arr)-1

    while i < j:
        if(arr[i] != arr[j]):
            return "Not a Palindrome."
        i += 1
        j -= 1

    return "The Array is Palindrome."

def main():
    arr = [1,2,3,4,3,2,1]
    print(palindrome_arr(arr))

main()