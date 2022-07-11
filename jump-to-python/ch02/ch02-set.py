# s1 = set(1, 2, 3)    # error
s1 = set([1, 2, 3])
print(s1)    # {1, 2, 3}
print(type(s1)) # <class 'set'>

s1 = set([1, 1, 1, 1, 2, 3, 4, 5, 6])
s2 = set([4, 4, 4, 5, 6, 7, 8, 9])
print(s1)
print(s2)

print(s1 & s2)
print(s1.intersection(s2))  # 교집합

print(s1 | s2)
print(s1.union(s2)) # 합집합

print(s1 - s2)
print(s1.difference(s2))    # 차집합

s1 = set([1, 2, 3])
s1.add(4)
print(s1)

s1 = set([1, 2, 3])
s1.update([5, 6, 7])
print(s1)

s1 = set([1, 2, 3])
s1.remove(2)
print(s1)