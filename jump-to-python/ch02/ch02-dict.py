dic = {'name':'pey', 'phone':'0119993323', 'birth': '1118'}
print(dic)  # {'name': 'pey', 'phone': '0119993323', 'birth': '1118'}


a = {1 : 'a'}
a[2] = 'b'
a['name'] = 'pey'
print(a)    # {1: 'a', 2: 'b', 'name': 'pey'}

del a[1]
print(a)    # {2: 'b', 'name': 'pey'}

a = {'name': 'pey', 'phone': '0119993323', 'birth': '1118'}
print(a.keys()) # dict_keys(['name', 'phone', 'birth'])

for k in a:
    print(k, end=" ")
    
print()
print(list(a.keys()))    # ['name', 'phone', 'birth']
print(a.values())   # dict_values(['pey', '0119993323', '1118'])
print(a.items())    # dict_items([('name', 'pey'), ('phone', '0119993323'), ('birth', '1118')])

for i, j in a.items():
    print(f"key : {i} value : {j}")
# key : name value : pey
# key : phone value : 0119993323
# key : birth value : 1118

print(a)
a.clear()
print(a)    # {}



a = {'name':'pey', 'phone':'0119993323', 'birth': '1118'}
print(a.get('name'))    # pey
print(a.get('phone')) # 0119993323
print(a.get('where'))   # None
print(a['name'])    # pey
print(a.get('foo', 'bar'))  # bar 
# print(a['where'])   # KeyError: 'where'

a = {'name':'pey', 'phone':'0119993323', 'birth': '1118'}

print('name' in a) # True
print('email' in a) # False