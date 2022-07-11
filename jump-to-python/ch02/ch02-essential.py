a = "hobby"
print(a.count('b')) # 2
print(a.find('b')) # 2
print(a.index('b')) # 2
print(a.index('y')) # 2

print(",".join('abcd')) # a,b,c,d
print("||".join("ABCD"))    # A||B||C||D

a = "hi"
print(a.upper())

a = "HI"
print(a.lower())

a = "lstrip       "
print("before len(a):" + str(len(a)))   # before len(a):13
print("after len(a):" + str(len(a.lstrip())))   # after len(a):13


a = "  hi   "
print("before" + a)
print("after :" + a.rstrip())

a = "Life is too short"
print(a.replace("Life", "Your leg"))    # Your leg is too short
print(a) # Life is too short

a = "Life is too short"
print(a.split())
b = "a:b:c:d"
print(b.split(':'))