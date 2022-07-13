# Q1

a, b, c = 80, 75, 55
print(f"Q1 : {(a + b + c) / 3}")

print("=====Q2=====")

if (13 % 2 == 1):
    print("홀수")
else:
    print("짝수")
    
a = "a:b:c:d"
print(a.replace(":", "#"))

a = [5, 4, 3, 2, 1]
a.sort()
print(a)

a = ['Life', 'is', 'too', 'short'] 
print(' '.join(a))

a = (1, 2, 3)
b = (4,)
print(a+b)

a = {'A':90, 'B':80, 'C':70}
print(a.pop('B'))


a = [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5]
print(set(a))
