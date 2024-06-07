for _ in range(int(input())):
    word = input()
    
    if word[-1] == "a" or word[-1] == "o" or word[-1] == "u":
        print(word + "s")
    elif word[-1] == "i" or word[-1] == "y":
        print(word[0:-1] + "ios")
    elif word[-1] == "n":
        print(word[0:-1] + "anes")
    elif word[-2:len(word)] == "ne":
        print(word[0:-2] + "anes")
    elif word[-1] == "l" or word[-1] == "r" or word[-1] == "v":
        print(word + "es")
    elif word[-1] == "t" or word[-1] == "w" :
        print(word + "as")
    else:
        print(word + "us")