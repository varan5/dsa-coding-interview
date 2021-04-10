
data = {1: "a", 2: "b", 3: "c", 4: "d"}
string = "abc"

# print(data.values())
# if 'a' in data.values():
#     print('Yes')
# else: 
#     print('No')

for char in string:
    if char in data.values:
        print('Char present in data')
    else:
        print('Absent')


