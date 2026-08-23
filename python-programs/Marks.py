marks = int(input("Enter Your marks : "))

if marks<=100:
    if marks >= 85:
        print("You Got Distinction.")

    elif marks >= 65:
        print("You passed in first class.")

    elif marks >=50:
        print("You passed in second class.")

    elif marks >= 35:
        print("You are Just pass.")

    else:
        print("You are failed.")
else:
    print("Enter Valid Input.")