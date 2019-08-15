# Accept the number of lines as integer input
lines = int(input())
# Declare a dictionary to hold our data
data = {}
# For loop, running n lines (if n lines of input were specified)

# We know the input is in a key:value format
for i in range(lines):
    # Set a variable k to the key part, and the corresponding value in the dict to the value
    # We make use of the split() function, which will split the input line at ':' and give us 2 elements
    k, data[k] = input().split(':')

# Accept the input phrase
phrase = input()
# Get the individual words in the phrase as part of a list
words = phrase.split(' ')
# If the entire phrase is part of the keys, display the corresponding value
if phrase in data.keys():
    print(data[phrase])
# If the first two words (concatenated with a space in the middle) are a key, then display the
# corresponding value, as well as the value corresponding to the last word (which will obviously
# also be a key)
elif words[0]+' '+words[1] in data.keys():
    print(f"{data[words[0]+' '+words[1]]} {data[words[2]]}")
# If the last two words (concatenated with a space in the middle) are a key, then display the
# the value corresponding to the last word (which will obviously also be a key), as well as the
# corresponding value to the last two words
elif words[1]+' '+words[2] in data.keys():
    print(f"{data[words[0]]} {data[words[1]+' '+words[2]]}")
# Otherwise, each of the individual words will be a key. Just pring the corresponding values
else:
    print(f"{data[words[0]]} {data[words[1]]} {data[words[2]]}")