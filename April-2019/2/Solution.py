# Accept the input as an integer
t = int(input())
ans = 1
# A loop to compute the factorial
for i in range(1, t+1):
    ans = ans * i
# Print the result
print(ans)
