n = int(input())
c = list(map(int, input().split()))
h = list(map(int, input().split()))

strength = n

for i in range(1, n + 1):

    start = i - c[i-1]
    if start < 1:
        start = 1

    end = i + c[i-1]
    if end > n:
        end = n

    strength += (end - start)

if sum(h) > strength:
    print('NO')
else:
    print('YES')
