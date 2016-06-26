from sklearn import linear_model,datasets
import matplotlib.pyplot as plt
import numpy as np

#regression
diabetes=datasets.load_diabetes()

diabetes_X=diabetes.data[:,np.newaxis,2]
diabetes_X_train = diabetes_X[:-20]
diabetes_X_test = diabetes_X[-20:]
diabetes_y_train = diabetes.target[:-20]
diabetes_y_test = diabetes.target[-20:]

regr=linear_model.LinearRegression()
regr.fit(diabetes_X_train,diabetes_y_train)
#result output
print('Coefficiens:',regr.coef_)
print('Variance Score:%.2f' % regr.score(diabetes_X_test,diabetes_y_test))

#plot output
plt.scatter(diabetes_X_test,diabetes_y_test,color='black')
plt.plot(diabetes_X_test,regr.predict(diabetes_X_test),color='blue',linewidth=2)

plt.xticks(())
plt.yticks(())

plt.show()

