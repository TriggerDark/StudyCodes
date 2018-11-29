# test.py


class Test(object):
    def __init__(self, filepath1, filepath2):
        super(Test, self).__init__()
        self.file_path1 = filepath1
        self.file_path2 = filepath2

    def cal(self):
        x = 0

        with open(self.file_path1, "r") as f:
            s = f.readlines()
            print(s)
        f.close()

        fp = open(self.file_path2, "w")
        while x < len(s):
            question = s[x].rstrip("=\n")
            result = eval(s[x].lstrip().rstrip("=\n"))
            print(question, " = ", result)
            text = question + "=" + str(result)
            fp.write(text + "\n")
            x += 1

        fp.close()


test = Test("./question.txt", "./test.txt")
test.cal()
