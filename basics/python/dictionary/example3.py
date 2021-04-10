
dict = { 1: "a", 2: "b", 3: "c", 4: "d" } 
empty_dict = {}
string = "abc"

for char in string:
    empty_dict[string.index(char)] = char

print(empty_dict)