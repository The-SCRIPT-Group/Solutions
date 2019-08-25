m, n = input().split()
m, n = int(m), int(n)
k = int(input())

if m == 0 or n == 0:
    print('', end='')
    exit(0)

rows = {}
sums = []

for i in range(m):

    total = 0
    row = []

    for j in range(n):
        a = ((i + j) ** k) * ((-1) ** (i + j))
        total += a
        row.append(a)

    rows[total] = row
    sums.append(total)

sums.sort()

for i in range(len(sums)):
    if sums[i] >= 0:
        index = i
        break
else:
    index = len(sums)

res = ''

for i in sums[index:]:
    print(str(rows[i][0]), end='')
    for j in rows[i][1:]:
        print(' ' + str(j), end='')
    print()

for i in sums[:index]:
    print(str(rows[i][0]), end='')
    for j in rows[i][1:]:
        print(' ' + str(j), end='')
    print()
