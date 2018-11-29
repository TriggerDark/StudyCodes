with open("./question.txt", "r") as f:
    s = f.readlines()
    print(s)


def cal(str_s, filepath):
    x = 0
    fp = open(filepath, "w")

    while x < len(str_s):
        question = str_s[x].rstrip("=\n")
        result = eval(str_s[x].lstrip().rstrip("=\n"))
        print(question, " = ", result)
        text = question + "=" + str(result)
        fp.write(text + "\n")
        x += 1

    fp.close()


cal(s, "result_data.txt")
f.close()
