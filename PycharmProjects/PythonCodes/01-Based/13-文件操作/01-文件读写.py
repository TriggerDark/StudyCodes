f = open("1.txt", "w")

for i in range(5):
    f.writelines(str(i))

f.close()