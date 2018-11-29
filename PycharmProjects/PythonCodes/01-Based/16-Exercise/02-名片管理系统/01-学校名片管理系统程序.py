# 学校名片管理系统程序
# 1、添加一个名片
# 2、删除一个名片
# 3、修改一个名片
# 4、查找一个名片
# 5、查看所有名片
# 6、退出系统

card_infos = []

# 加载名片信息


def loadInfos():
    global card_infos
    try:
        with open("./infos.txt", "r")as f:
            card_infos = eval(f.read())

    except Exception:
        pass

# 保存名片信息


def saveInfos(save_infos):
    with open("./infos.txt", "w")as f:
        f.write(save_infos)

# 主菜单


def menu():
    print("              系统显示              ")
    print()
    print("============1、添加一个名片==========")
    print("============2、删除一个名片==========")
    print("============3、修改一个名片==========")
    print("============4、查找一个名片==========")
    print("============5、查看所有名片==========")
    print("==============6、退出系统============")
    print()
    print("=" * 36)

# 增加名片信息


def addInfos():
    print("=" * 50)
    print("-----添加一个名片-----")
    info = {}
    name = input("请输入要添加的名字：")
    email = input("请输入邮箱：")
    tel = input("请输入手机号：")
    addr = input("请输入地址信息：")

    info["Name"] = name
    info["Email"] = email
    info["Tel"] = tel
    info["Addr"] = addr

    card_infos.append(info)

    saveInfos(str(card_infos))
    print()

# 删除名片信息


def delInfos():
    print("=" * 50)
    print("-----删除一个名片-----")
    del_name = input("请输入要删除名片的名字：")
    global card_infos
    card_infos = [temp for temp in card_infos if not temp["Name"] == del_name]
    saveInfos(str(card_infos))


# 修改名片信息
def modify():
    print("=" * 50)
    print("--------修改一个名片----")
    global card_infos
    name = input("请输入你的名字：")
    for temp in card_infos:
        if temp["Name"] == name:
            print("请选择你要修改的信息请输入一下指令\n1:Name,\n2:Email,\n3:Tel,\n4:Address,\n5:exit")
            while True:
                x = eval(input("输入指令："))
                if x == 1:
                    modify_name = input("change to:")
                    temp["Name"] = modify_name
                elif x == 2:
                    modify_email = input("change to:")
                    temp["Email"] = modify_email
                elif x == 3:
                    modify_tel = input("change to:")
                    temp["Tel"] = modify_tel
                elif x == 4:
                    modify_addr = input("change to:")
                    temp["Addr"] = modify_addr
                elif x == 5:
                    break
                else:
                    print("指令错误！！！")
    saveInfos(str(card_infos))

# 查找名片信息


def searchInfos():
    print("=" * 50)
    print("-----查找一个名片-----")
    search_name = input("请输入要查找名片的名字：")
    flag = 0
    for temp in card_infos:
        if search_name == temp["Name"]:
            print("%s\t%s\t%s\t%s\t" %
                  (temp["Name"], temp["Email"], temp["Tel"], temp["Addr"]))
            flag = 1
    if not flag:
        print("查无此人")


# 查看名片信息


def lookInfos():
    print("=" * 50)
    print("-----查看所有名片-----")
    print()
    print("Name\tEmail\tTel\tAddr")
    for temp in card_infos:
        print("%s\t%s\t%s\t%s" %
              (temp["Name"], temp["Email"], temp["Tel"], temp["Addr"]))

    print()

# 主函数


def main():

    loadInfos()

    menu()

    while True:
        num = eval(input("请输入一个1-6之间的数字："))

        if num == 1:
            addInfos()
        elif num == 2:
            delInfos()
        elif num == 3:
            modify()
        elif num == 4:
            searchInfos()
        elif num == 5:
            lookInfos()
        elif num == 6:
            break
        else:
            print("您的输入有误")


if __name__ == "__main__":
    main()
