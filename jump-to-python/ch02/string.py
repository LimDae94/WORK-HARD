print("Life is too short, You need Python")
print('Python is fun')
print("""Life is too short, You need python""")
print('''Life is too short, You need python''')

food = "Python's favorite food is perl"
print(food)

food = 'Python\'s favorite food is perl'
print(food)

head = "python"
tail = " is fun!"
print(head + tail)

a = "python"
print(a * 2)

a = "python is fun!"
print(len(a))

a = "python"
print(len(a))

a = "Life is too short, You need Python"
print(a[3])
print(a[:])
print(a[4:])
print(a[:6])
print(a[28:])
print(a[-1])
print(a[:-1])


print("%10s" % "hi")
print("%-10sjane" % "hi")
print("%0.4f" % 0.12345678)
print("%0.f" % 0.123456789)

print("I eat {0} apples".format(3) )
print("I eat {0} apples".format("five"))


number = 10
day = "three"
print("I ate {0} apples. so I was sick for {1} days.".format(number, day))
print( "I ate {number} apples. so I was sick for {day} days.".format(number=10, day=3))

print("{0:<10}".format("hi"))   #hi
print("{0:>10}".format("hi"))   #        hi
print("{0:^10}".format("hi"))   #    hi

print(f'{"hi":=^10}')
print(f'{"hi":!<10}')
print(f'{"hi":!>10}')