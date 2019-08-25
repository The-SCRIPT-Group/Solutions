t = list(map(int, input().split()))

if 1>t[0] or 12<t[0] or 0>t[1] or 59<t[1]:
    print('Incorrect Input', end='')
    exit(0)
    
ones = ["one", "one","two","three","four", "five", "six","seven","eight","nine","ten","eleven","twelve", "thirteen", "fourteen", "fifteen","sixteen","seventeen", "eighteen","nineteen"]
 
twenties = ["","","twenty ","thirty ","forty ", "fifty ","sixty ","seventy ","eighty ","ninety "]

time = ''
if t[1] == 0:
    time = ones[t[0]].capitalize() + " o' clock"
elif t[1] == 15:
    time = 'Quarter past ' + ones[t[0]].capitalize()
elif t[1] == 30:
    time = 'Half past ' + ones[t[0]].capitalize()
elif t[1] == 45:
    time = 'Quarter to ' + ones[(t[0]+1)%13].capitalize()
elif t[1] < 2:
    time = ones[t[1]].capitalize() + " minute past " + ones[t[0]].capitalize()
elif t[1] < 20:
    time = ones[t[1]].capitalize() + " minutes past " + ones[t[0]].capitalize()
elif t[1] < 30:
    time = twenties[int(t[1]/10)].capitalize() + ones[t[1]%10] + ' minutes past ' + ones[t[0]].capitalize()
elif t[1] < 41:
    time = twenties[int((60-t[1])/10)].capitalize() + ones[(60-t[1])%10] + ' minutes to ' + ones[(t[0]+1)%13].capitalize()
elif t[1] < 59:
    time = ones[(60-t[1])].capitalize() + ' minutes to ' + ones[(t[0]+1)%13].capitalize()
else:
    time = ones[(60-t[1])].capitalize() + ' minute to ' + ones[(t[0]+1)%13].capitalize()
    
print(t[0], ':', str(t[1]).rjust(2, '0'), time, end='')
