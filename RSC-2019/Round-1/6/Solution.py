s = input()

res = ''

for i in s:
    if i == '4':
        res += '1'
    else:
        res += '0'

print(str(int(s.replace('4', '3'))) + '\n' + str(int(res)), end='')
