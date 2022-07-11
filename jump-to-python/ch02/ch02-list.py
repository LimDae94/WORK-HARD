a = [1, 2, 3, ['a', 'b', 'c']]
print(a) # [1, 2, 3, ['a', 'b', 'c']]
print(a[0]) # 1
print(a[3]) # ['a', 'b', 'c']
print(a[3][0])  # a
print(a[-1]) # ['a', 'b', 'c']
print(a[-1][2]) # c

a = [1, 2, 3]
b = [4, 5, 6]
print(a + b)    # [1, 2, 3, 4, 5, 6]

a = [1, 2, 3]
print(a * 3)    # [1, 2, 3, 1, 2, 3, 1, 2, 3]

a = [1, 2, 3]
print(len(a))   # 3


a = [1, 2, 3]
print(f"before :{a}")
a[2] = 4
print(f"after :{a}")


a = [1, 2, 3, 9, 5, 6]
print(f"before :{a}")
del a[3]
print(f"after :{a}")
del a[2:]
print(f"after : {a}")
