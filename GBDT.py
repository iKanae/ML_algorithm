#-*- coding: utf-8 -*-
from sklearn.ensemble import GradientBoostingClassifier
import numpy as np
import nltk
import pandas as pd
from sklearn.cross_validation import train_test_split
from sklearn.datasets import load_iris

#导入数据集
iris = load_iris()

#训练集拆分
data,label=iris.data,iris.target
label=np.array(label)
labels=label
data=np.array(data)
x_train, x_test, y_train, y_test = train_test_split(data, labels, test_size = 0.3)

#训练随机森林算法
clf = GradientBoostingClassifier(n_estimators=200)
clf=clf.fit(x_train,y_train)

#预测类别
print clf.predict([18,345,12,0])

#每个特征的权重
print clf.feature_importances_

#查看准确率crosstab
y_pred=clf.predict(x_test)
tab=pd.crosstab(y_test, y_pred, rownames=['actual'], colnames=['preds'])
print tab
