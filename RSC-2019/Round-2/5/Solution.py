rows, cols = list(map(int, input().split('\t')))
mat, meow = list(), list()
meowTop = meowDown = maxLeft = maxRight = maxTop = maxDown = maxSum = 0


for _ in range(rows):
    mat.append(list(map(int, input().split('\t'))))



def tempsum(arr):
    sum = 0
    for i in range(len(arr)):
        meow = 0
        for j in range(i, len(arr)):
            meow += arr[j]
            if meow > sum:
                global meowTop, meowDown
                sum, meowTop, meowDown = meow, i, j
    return sum




for left in range (cols):
    meow = [0] * rows
    
    for right in range(left, cols):
        for i in range(rows):
            meow[i] += mat[i][right]

        sum = tempsum(meow)
        if sum > maxSum:
            maxSum, maxLeft, maxRight, maxTop, maxDown = sum, left, right, meowTop, meowDown


for i in range(maxTop, maxDown+1):
    for j in range (maxLeft, maxRight+1):
        print(str(mat[i][j]) + "\t", end= '')
    print()
