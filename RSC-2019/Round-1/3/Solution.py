n = int(input())

for i in range(1, n+1):
    print(' '*(n-i), *range(1, i+1), sep='')
