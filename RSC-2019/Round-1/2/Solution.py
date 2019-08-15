n = int(input())

for i in range(n):
    times = list(map(int, input().split()))
    if times[1] - times[0] >= 5:
        print(times[0], end='')
        break
else:
    print('doggy sad', end='')
