let arr = [32, 42, 11, 43, 464, 56, 87, 23];

let Selection = function (arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    let mid = i;
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] < arr[j]) {
        mid = j;
      }
    }
    let temp = arr[mid];
    arr[mid] = arr[i];
    arr[i] = temp;
  }
  return arr;
};

console.log(Selection(arr));
