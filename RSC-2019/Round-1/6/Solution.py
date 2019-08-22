n = input()

subs = list(map(int, input().split()))

subs.append(60)

dirtyness = 0
cleanup = 0
multiplier = 1

for i in range(1, len(subs)):
    dirtyness += (subs[i] - subs[i-1]) * multiplier
    if dirtyness < 20:
        multiplier += 1
    else:
        dirtyness = 0
        multiplier = 1
        cleanup += 1

print(cleanup, end='')
