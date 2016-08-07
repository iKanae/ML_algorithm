#-*- coding: utf-8 -*-
import random
#敏感常量
a = 0
b = 1664525
c = 1013904223
m=2^32

def swap(a,b,num):
    temp=num[a]
    num[a]=num[b]
    num[b]=temp
    return num

def myrand(num,seed):
    randlist=[]
    temp=seed
    for i in range(1,num):
        temp=(a * temp^2 + b*temp + c) % m
        randlist.append(temp)
    return randlist

def shuffle(num,seed):
    n=len(num)
    for i in range(1,n-1):
        num=swap(n-i,myrand(2,seed)[0]%(n-i-1),num)
        #seed = (myrand(2, seed)[0]) % (n-i-1)
        seed=(b*seed + c) % m
    return num

#每个梯度随机（依据seed）
for i in range(1,9):
    print shuffle(range(1,10),i)
