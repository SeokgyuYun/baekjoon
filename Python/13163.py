for i in range(0, int(input())):
    name = input().split(' ')
    for j in range(0, len(name)):
        if j == 0:
            print('god', end='')
        else:
            print(name[j], end='')
    print()
