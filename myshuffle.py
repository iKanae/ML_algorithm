#-*- coding: utf-8 -*-
import random
def swap(a,b,num):
    temp=num[a]
    num[a]=num[b]
    num[b]=temp
    return num

def shuffle(num):
    n=len(num)
    for i in range(1,n-1):
        num=swap(n-i-1,random.randint(0,n-i-1),num)
    return num

num=range(1,50,1)
print shuffle(num)
