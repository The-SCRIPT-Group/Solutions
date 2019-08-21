a = int(input())

fib = [0, 1]

for i in range(a - 2):
    fib.append(fib[-1] + fib[-2])
    res = 0
    
for i in range(0, len(fib), 2):
    res += fib[i] * ((-1) ** (i / 2))

print(int(res))
