arr = [3,1,5,5,0,3,2,12];
target = 10
for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        if arr[i]+arr[j] == target:
            print([i,j]);
