import sys
input= sys.stdin.readline

li = { "Kamen":1, "Rock" : 1 , "Pierre":1 , "Stein":1, "Ko":1, "Koe":1, "Sasso":1, "Roccia":1, "Guu":1, "Kamien":1, "Piedra":1,
"Nuzky":2 , "Scissors":2, "Ciseaux":2, "Schere":2, "Ollo":2, "Olloo":2, "Forbice":2, "Choki":2, "Nozyce":2, "Tijera":2,
"Papir":3, "Paper":3 , "Feuille":3, "Papier":3, "Carta":3, "Rete":3, "Paa":3, "Papier":3, "Papel":3}
cnt = 1 
error = 0
  
while True:
    name = input().rstrip().split()
    name2= input().rstrip().split()
    name = name[1]
    name2 = name2[1]
    name1_score=  0
    name2_score=  0

    while True:
        game = input().rstrip().split()
        if game[0] == "-": 
            break
        if game[0] == ".": 
            error += 1
            break

        a = li.get(game[0]) 
        b = li.get(game[1])

        if a == 1 and b==2: 
            name1_score +=1
        elif a== 1 and b==3:
            name2_score += 1
        elif a== 2 and b==1:
            name2_score += 1
        elif a== 2 and b==3:
            name1_score += 1
        elif a== 3 and b==1:
            name1_score += 1
        elif a== 3 and b == 2:
            name2_score += 1


    print("Game #{}:".format(cnt))
    if name1_score !=1: 
        print("{}: {} points".format(name, name1_score))
    else:
        print("{}: {} point".format(name, name1_score))
    if name2_score !=1: 
        print("{}: {} points".format(name2, name2_score))
    else:
        print("{}: {} point".format(name2, name2_score))

    if name1_score == name2_score:
        print("TIED GAME")
    elif name1_score > name2_score:
        print("WINNER: {}".format(name))
    elif name2_score > name1_score:
        print("WINNER: {}".format(name2))
    
    cnt += 1
    print()
    if error == 1:
        break