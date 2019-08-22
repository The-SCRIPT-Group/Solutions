n = input()

arr = list(map(int, input().split()))

index = list()
values = list()
for j in range(len(arr)):
    if arr[j] < 0 and arr[j] % 2 != 0 or arr[j] >= 0 and \
        arr[j] % 2 == 0:
        index.append(j)
        values.append(arr[j])

values.sort()

meow = 0
for j in index:
    arr[j] = values[meow]
    meow += 1

print(*arr)
