
def main():
    sums = 0
    sums_modified = do(sums)
    print('sums after the call to do is ', sums)
    print('Modifies sums is ', sums_modified)

def do(sums):
    sums = sums + 3
    print('sums in do function is ', sums)
    return sums

main()