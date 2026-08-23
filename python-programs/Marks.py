name = input("Enter You Name : ")
cls  = input("Enter Your Class : ")
marks1 = int(input("Enter Your subject 1 marks : "))
marks2 = int(input("Enter Your subject 2 marks : "))
marks3 = int(input("Enter Your subject 3 marks : "))
total = marks1+marks2+marks3
marks = total/3;

if marks >= 85:
    print(f"You Got Distinction {marks}.")

elif marks >= 65:
    print(f"You passed in first class {marks}.")

elif marks >=50:
    print(f"You passed in second class {marks}.")

elif marks >= 35:
    print(f"You are Just pass {marks}.")

else:
    print(f"You are failed {marks}.")