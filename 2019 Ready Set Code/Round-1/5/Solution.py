s = input()

n = {}

for i in s:
    if i in n.keys():
        n[i] += 1
    else:
        n[i] = 1

err = 0
for i in n.values():
    if i % 2 != 0:
        err += 1
        if err > 1:
            print('NO')
            exit(0)

print('YES')
