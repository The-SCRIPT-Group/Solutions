import re

s, t, p = input(), input(), input()

if not re.match('.*' + '.*'.join(s) + '.*', t):
    print('NO')
    exit(0)

for j in t:
    if j in s:
        s = s.replace(j, '', 1)
    elif j in p:
        p = p.replace(j, '', 1)
    else:
        print('NO')
        exit(0)

print('YES')
