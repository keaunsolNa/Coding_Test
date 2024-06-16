while True:
    try:
        s = input()
        print(bytearray.fromhex(s).decode())

    except EOFError:
        break