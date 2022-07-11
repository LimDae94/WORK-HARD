import re


a = "Life is too short, you need python"

if "wife" in a: print("wife")
elif "python" in a and "you" not in a: print("python")
elif "shirt" not in a: print("shirt")
elif "need" in a: print("need")
else: print("none")


k = 0
result = 0
while(True):
    if k == 1000:
        break
    k += 1
    
    if (k % 3 == 0):
        result += k
print(result)
    
    
for i in range(1, 6):
    print("*" * i)
    
for i in range(1, 101):
    print(i, end= " ")
print()
student = [70, 60, 55, 75, 95, 90, 80, 80, 85, 100]

result = 0
for i in student:
    result += i
print(result / len(student))

numbers = [1, 2, 3, 4, 5]
result = []
for n in numbers:
    if n % 2 == 1:
        result.append(n*2)
print(result)

numbers = [1, 2, 3, 4, 5]
result = [x*2 for x in numbers if x % 2 == 1]
print(result)