word = input()

wrap = ''
layer = ''

length = len(word) + (len(word) - 1)


for i in word:
    wrap += layer + (i * length) + layer[::-1] + '\n'
    layer += i
    length -= 2

for i in word[::-1]:
    if length > 0:
        wrap += layer + (i * length) + layer[::-1] + '\n'
    layer = layer[::-1].replace(i, '', 1)[::-1]
    length += 2
    
print(wrap)
