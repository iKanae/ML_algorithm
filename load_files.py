#-*- coding: utf-8 -*-
from numpy import *
from sklearn.datasets import load_iris
from sklearn.linear_model import LogisticRegression
from sklearn.datasets import load_files
import numpy as np

#load the data
iris = load_iris()
samples = iris.data
target=iris.target
test_data=np.array([[1,1,1],[2,2,2],[1,2,3]])
print test_data
targer=np.array([[1],[1],[0]])
#train the model
classifier = LogisticRegression()
classifier.fit(test_data, targer)

#predict the result
x = classifier.predict([5, 3, 2.5])
print x
