from sys import stdin


keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;\'ZXCVBNM,./"

while True:
    sentence = stdin.readline().rstrip()

    if sentence == '':
        break

    sentence_len = len(sentence)
    result = ''

    for idx in range(sentence_len):
        if sentence[idx] != ' ':
            keyboard_idx = keyboard.index(sentence[idx])

            result += keyboard[keyboard_idx - 1]
        else:
            result += ' '
    
    print(result)