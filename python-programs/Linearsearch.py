def linear_search(arr, target):
    for i in range(len(arr)):
        if(arr[i]==target):
            return f"Index of {i}"
    return "Not Found."

def main():
    arr = [2,4,1,6,8,7,9,10]
    target = int(input("Enter Your Target : "))
    print(linear_search(arr,target));

main()

