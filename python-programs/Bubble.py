arr = [2,3,4,2,4,5,8,3];
count = 0;

for i in range(0,len(arr)):
    for j in range(0,len(arr)-1-i):
        count += 1
        if arr[j] > arr[j+1]:
             temp = arr[j]
             arr[j] = arr[j+1]
             arr[j+1] = temp

print(count);
print(arr);