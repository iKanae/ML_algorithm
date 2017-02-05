#-*- coding: utf-8 -*-
import random

#输入目标数字
def FirstInput():
    num=[]
    while len(num)<4:
        temp=raw_input("Enter the number:")
        if temp.isdigit():
            if int(temp)>=14 or int(temp)<=0:
                print("This number is out  of range!")
            else:
                num.append(int(temp))
        else:
            print("It is not a valid number!")
    return num

#计算24点
def Count24(num):
    di={"1":"+","2":"-","3":"*","4":"/"}
    value=0
    for i in range(4):
        num[i]=str(float(num[i]))
    while value<>24:
        list=num[:]
        result = []
        while len(list)>1:
            index=int(random.choice(range(0,len(list))))
            a=list[index]
            list.pop(index)
            if len(list)==1:
                index=0
            else:
                index = int(random.choice(range(0, len(list))))
            b=list[index]
            list.pop(index)
            #计算值
            oc=int(random.choice(range(1,5)))
            eq = str(a)+di[str(oc)]+str(b)
            try:
                value=eval(eq)
            except ZeroDivisionError:
                oc = int(random.choice(range(1, 4)))
                eq = str(a) + di[str(oc)] + str(b)
                value=eval(eq)
            #存公式
            list.append(str(value))
            result.append([eq])
    return value,result

print Count24(FirstInput())
#一个bad case 7 7 2 10