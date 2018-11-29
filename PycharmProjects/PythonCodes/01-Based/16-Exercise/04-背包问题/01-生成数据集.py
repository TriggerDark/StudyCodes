import random
import time


def filePath(filename, size):
    with open(filename, "w") as f:
        f.write("Size" + "\t" + "Ponder" + "\t" + "Price" + "\n")
        for i in range(size):
            f.write(str(i + 1) + '\t'*2 + str(random.randint(0, size)) + '\t'*2 + str(random.randint(0, size)) + '\n')


def main():
    Size = [1000, 10000, 100000]
    for i in Size:
        filePath(str(i) + "DataSet.txt", i)


if __name__ == "__main__":
    t_start = time.time()
    main()
    t_end = time.time()
    print(t_end - t_start)