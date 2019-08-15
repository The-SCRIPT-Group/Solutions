def prime(n: int):
    c = 0
    for i in range(2, n):
        if n%i == 0:
            c+=1
    return c == 0

n = int(input())
if n <= 1:
    print("NONE")
else:
    print("PRIME") if prime(n) else print("NOT PRIME")