def add_many(*args):
    result = 0
    for i in args:
        result += i
    return result

print(add_many(1, 2))
print(add_many(1, 2, 3, 4, 5, 6, 7))
print(add_many(8, 9, 10))




def print_kwargs(**kwargs):
    print(kwargs)
    

print_kwargs(a=1)


