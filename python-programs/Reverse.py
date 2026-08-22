n = 121
ori = n
rev = 0

while n!=0:
    digit = n % 10
    rev = rev * 10 + digit 
    n = n//10

if ori == rev:
    print("The Value is Palindrome")
else:
    print("Not A Palindrome.")