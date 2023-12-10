def big_number_cacluation(formula):
    return eval(formula)
        
        
if __name__ == "__main__":
    formula = []
    
    number_len = int(input())
    
    for _ in range(number_len * 2 - 1):
        num_or_operator = input()
        
        formula.append(num_or_operator)
        
    formula = "".join(formula).replace("/", "//")
    
    print(big_number_cacluation(formula))