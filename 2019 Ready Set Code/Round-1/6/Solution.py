import re
n = input()
print(n.replace('4', '3'))
print(re.sub('[123567890]', '0', n).replace('4', '1'), end='')
