health, minutes = list(map(int,input().split()))
change = list(map(int,input().split()))
max = int(1e15)
mini = max
sum = 0
ans = 0
current = health
for f in change:
    sum += f
    mini = min(mini, sum)
if mini >= 0:
    print(-1)
    exit(0)
rem = health
if health > abs(mini):
    if sum >= 0:
        print(-1)
        exit(0)
    else:
        sum = -sum
        ans = int((health+mini)/sum)
        if int((health+mini)%sum) != 0:
            ans += 1
        rem = health - sum * ans
c = 1
for f in change:
    rem += f
    if rem <= 0:
        print(int(ans*minutes+c))
        exit(0)
    c+=1