#-*- coding: utf-8 -*-
def swap(a,b,num):
    temp=num[a]
    num[a]=num[b]
    num[b]=temp
    return num

def myrand(num,seed,a,b,c,m):
    randlist=[]
    temp=seed
    for i in range(num):
        temp=(a * temp^2 + b*temp+c) % m
        randlist.append(temp)
    return randlist

#a,b,c一般取质数
num=20
seed=3
print myrand(num,seed,7^5,0,2^31-1,100)
